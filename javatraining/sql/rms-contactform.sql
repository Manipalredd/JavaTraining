DROP DATABASE rms;
create database rms;

DROP TABLE IF EXISTS `contactform`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contactform` (
  `id` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `email` varchar(255) NOT NULL,
  `mobileno` varchar(15) NOT NULL,
  `query` text NOT NULL,
  `status` varchar(50) DEFAULT 'Pending',
  `role` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactform`
--

LOCK TABLES `contactform` WRITE;
/*!40000 ALTER TABLE `contactform` DISABLE KEYS */;
INSERT INTO `contactform` VALUES (3,'Kiran','K','mahita2.bvrm@gmail.com','9908310707','hello','Accepted','Artist'),(4,'Kiran','K','mahita1.bvrm@gmail.com','9908310707','hey','Accepted','Artist'),(5,'viswa','K','mahita3.bvrm@gmail.com','9908310707','ertyu','Accepted','Artist'),(6,'Chaitu','Bonagiri','manichaitanya.mc@gmail.com','9885064363','want to be an artist','Accepted','Artist'),(7,'manipal','reddy','manipalreddy622@gmail.com','456794527827','Hello','Accepted','Artist');
/*!40000 ALTER TABLE `contactform` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


