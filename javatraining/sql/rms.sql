drop database if exists rms;
 
create database rms;
 
use rms;
 
CREATE TABLE Users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    mobile_no VARCHAR(15),
    address TEXT,
    role ENUM('Admin', 'Artist', 'Manager') NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    first_login BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    is_active BOOLEAN DEFAULT TRUE
);
 
CREATE TABLE Songs (
    song_id INT AUTO_INCREMENT PRIMARY KEY,
    artist_id INT NOT NULL,
    title VARCHAR(255) NOT NULL,
    release_date DATE NOT NULL,
    collaborators TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (artist_id) REFERENCES Users(user_id) ON DELETE CASCADE
);
 
CREATE TABLE Streams (
    stream_id INT AUTO_INCREMENT PRIMARY KEY,
    song_id INT NOT NULL,
    stream_date DATE NOT NULL,
    stream_count INT DEFAULT 0,
    FOREIGN KEY (song_id) REFERENCES Songs(song_id) ON DELETE CASCADE
);
 
CREATE TABLE Partnerships (
    partnership_id INT AUTO_INCREMENT PRIMARY KEY,
    artist_id INT NOT NULL,
    manager_id INT NOT NULL,
    status ENUM('Pending', 'Accepted', 'Rejected') DEFAULT 'Pending',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (artist_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (manager_id) REFERENCES Users(user_id) ON DELETE CASCADE
);
 
CREATE TABLE Royalties (
    royalty_id INT AUTO_INCREMENT PRIMARY KEY,
    song_id INT NOT NULL,
    calculated_date DATE NOT NULL,
    total_streams INT NOT NULL,
    royalty_amount DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (song_id) REFERENCES Songs(song_id) ON DELETE CASCADE
);
 
CREATE TABLE Transactions (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    royalty_id INT NOT NULL,
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    transaction_amount DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (royalty_id) REFERENCES Royalties(royalty_id) ON DELETE CASCADE
);
 
CREATE TABLE Notifications (
    notification_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    message TEXT NOT NULL,
    is_read BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE
);
 
INSERT INTO Users (username, email, firstname, lastname, mobile_no, address, role, password_hash)
VALUES 
('artist1', 'artist1@example.com', 'John', 'Doe', '1234567890', '123 Music Street, NY', 'Artist', 'hashed_password_123'),
('artist2', 'artist2@example.com', 'Emily', 'Clark', '9876543211', '234 Melody Ave, LA', 'Artist', 'hashed_password_234'),
('manager1', 'manager1@example.com', 'Jane', 'Smith', '9876543210', '456 Management Blvd, CA', 'Manager', 'hashed_password_456'),
('admin1', 'admin1@example.com', 'Alice', 'Brown', NULL, NULL, 'Admin', 'hashed_password_789'),
('artist3', 'artist3@example.com', 'Michael', 'Jordan', '9998887776', '789 Harmony Lane, TX', 'Artist', 'hashed_password_567');

 
INSERT INTO Songs (artist_id, title, release_date, collaborators)
VALUES 
(1, 'Song A', '2023-05-10', 'Collaborator 1, Collaborator 2'),
(1, 'Song B', '2023-06-15', NULL),
(2, 'Song C', '2023-07-20', 'Collaborator 3'),
(3, 'Song D', '2023-08-05', 'Collaborator 4, Collaborator 5'),
(1, 'Song E', '2023-09-01', NULL);

INSERT INTO Streams (song_id, stream_date, stream_count)
VALUES 
(1, '2023-06-01', 5000),
(2, '2023-06-15', 1500),
(3, '2023-07-21', 8000),
(4, '2023-08-06', 4500),
(5, '2023-09-05', 10000);

INSERT INTO Partnerships (artist_id, manager_id, status)
VALUES 
(1, 3, 'Pending'),
(2, 3, 'Accepted'),
(3, 3, 'Rejected'),
(1, 3, 'Accepted'),
(2, 3, 'Pending');

INSERT INTO Royalties (song_id, calculated_date, total_streams, royalty_amount)
VALUES 
(1, '2023-07-01', 5000, 1000.50),
(2, '2023-07-10', 1500, 300.75),
(3, '2023-07-30', 8000, 2500.00),
(4, '2023-08-10', 4500, 1125.00),
(5, '2023-09-10', 10000, 5000.00);

INSERT INTO Transactions (user_id, royalty_id, transaction_amount)
VALUES 
(1, 1, 1000.50),
(2, 2, 300.75),
(1, 3, 2500.00),
(2, 4, 1125.00),
(3, 5, 5000.00);

INSERT INTO Notifications (user_id, message)
VALUES 
(1, 'Your royalty payment has been processed.'),
(2, 'A new partnership request is waiting for your approval.'),
(3, 'Your song has reached 10,000 streams!'),
(1, 'Partnership status updated to Accepted.'),
(2, 'Royalty payment for Song C is now available.');
 

 