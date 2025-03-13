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
    manager_id int not null,
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
 
 use rms;
 CREATE INDEX idx_artist_id ON Songs(artist_id);
CREATE INDEX idx_song_id ON Streams(song_id);
CREATE INDEX idx_artist_id_partnerships ON Partnerships(artist_id);
CREATE INDEX idx_manager_id_partnerships ON Partnerships(manager_id);


CREATE TABLE PartnershipStatus (
    status_id INT AUTO_INCREMENT PRIMARY KEY,
    status_name VARCHAR(50) NOT NULL
);

INSERT INTO PartnershipStatus (status_name) VALUES ('Pending'), ('Accepted'), ('Rejected');

ALTER TABLE Partnerships ADD COLUMN status_id INT;
ALTER TABLE Partnerships ADD CONSTRAINT FK_status FOREIGN KEY (status_id) REFERENCES PartnershipStatus(status_id);

ALTER TABLE Songs ADD COLUMN royalty_rate DECIMAL(10, 2) DEFAULT 0.05;

