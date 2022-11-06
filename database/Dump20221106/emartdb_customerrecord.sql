-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: emartdb
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customerrecord`
--

DROP TABLE IF EXISTS `customerrecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customerrecord` (
  `productName` varchar(255) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  `totalPrice` double DEFAULT NULL,
  `customerName` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customerrecord`
--

LOCK TABLES `customerrecord` WRITE;
/*!40000 ALTER TABLE `customerrecord` DISABLE KEYS */;
INSERT INTO `customerrecord` VALUES ('Coca-cola',2,9,18,NULL),('Fortune Sunfl',3,12,36,'1'),('Fortune Sunfl',4,12,48,'amruta'),('Rubic Cube',2,9,18,'savi'),('parachute',3,7,21,'pratik'),('Rubic Cube',4,9,36,'pratik'),('Apple',2,6,12,'sa'),('Battery',2,35,70,'sharad'),('Battery',3,35,105,'luffy'),('Keyboard',3,30,90,'luffy'),('Chess Board',4,27,108,'luffy'),('Rubic Cube',2,9,18,'luffy'),('Keyboard',3,30,90,'zoro'),('Chess Board',4,27,108,'zoro'),('Rubic Cube',2,9,18,'zoro'),('Fortune Sunfl',4,12,48,'nami'),('Apple',6,6,36,'nami'),('Fortune Sunfl',3,12,36,'robin'),('Apple',6,6,36,'robin'),('Apple',4,6,24,'robin'),('Fortune Sunfl',5,12,60,'robin'),('Apple',4,6,24,'robin'),('Apple',6,6,36,'robin'),('Apple',5,6,30,'nami'),('Keyboard',8,30,240,'nami'),('Apple',5,6,30,'luffy'),('Apple',7,6,42,'luffy'),('Apple',5,6,30,'luffy'),('Mouse',3,17,51,'luffy'),('Apple',5,6,30,'luffy'),('Keyboard',7,30,210,'luffy'),('Apple',6,6,36,'luffy'),('Mouse',2,17,34,'luffy'),('Chess Board',2,27,54,'luffy'),('Keyboard',2,30,60,'luffy'),('Keyboard',2,300,600,'luffy'),('Chess Board',3,276,828,'luffy'),('prachute',3,56,168,'sharad'),('Chana Dal',2,82,164,'sharad'),('parachute',3,45,135,'ashleasha'),('Coca-cola',3,90,270,'asmit'),('Chana Dal',5,82,410,'asmit'),('Apple',4,60,240,'ruchi'),('Chana Dal',5,82,410,'ishu'),('Apple',5,60,300,'ishu'),('Fortune Sunfl',3,122,366,'pratik'),('Chana Dal',5,82,410,'pratik'),('Fortune Sunfl',5,122,610,'sam'),('Apple',7,60,420,'sam');
/*!40000 ALTER TABLE `customerrecord` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-06 19:21:40
