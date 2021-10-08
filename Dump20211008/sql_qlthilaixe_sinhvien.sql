-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: sql_qlthilaixe
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `sinhvien`
--

DROP TABLE IF EXISTS `sinhvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinhvien` (
  `sinh_vien_id` int NOT NULL AUTO_INCREMENT,
  `users_id` varchar(50) NOT NULL,
  `lbl_id` int NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `ngay_sinh` datetime NOT NULL,
  `gioi_tinh` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `sdt` varchar(50) NOT NULL,
  `dia_chi` varchar(50) NOT NULL,
  `que_quan` varchar(50) NOT NULL,
  `cmnd` varchar(50) NOT NULL,
  `diem` tinyint NOT NULL,
  PRIMARY KEY (`sinh_vien_id`),
  KEY `fk_sinhvien_users_idx` (`users_id`),
  KEY `fk_sinhvien_loaibanglai_idx` (`lbl_id`),
  CONSTRAINT `fk_sinhvien_loaibanglai` FOREIGN KEY (`lbl_id`) REFERENCES `loaibanglai` (`lbl_id`) ON UPDATE CASCADE,
  CONSTRAINT `fk_sinhvien_users` FOREIGN KEY (`users_id`) REFERENCES `users` (`username`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinhvien`
--

LOCK TABLES `sinhvien` WRITE;
/*!40000 ALTER TABLE `sinhvien` DISABLE KEYS */;
INSERT INTO `sinhvien` VALUES (1,'admin',1,'Thí Sinh Một','2002-10-02 00:00:00','Nam','thisinhmot@gmail.com','0799999991','Hồ Chí Minh','Tiền Giang','215555555',14),(2,'admin',1,'Thí Sinh Hai','2003-10-03 00:00:00','Nữ','thisinhhai@gmail.com','0799999992','Hồ Chí Minh','Phú Yên','215555552',21),(3,'admin',1,'Thí Sinh Ba','2003-10-15 00:00:00','Nữ','thisinhba@gmail.com','0799999993','Hồ Chí Minh','Hồ Chí Minh','215555553',1),(4,'admin',1,'Thí Sinh Bốn','2003-10-24 00:00:00','Nữ','thisinhbon@gmail.com','0799999994','Hà Nội','Phú Yên','215555554',3);
/*!40000 ALTER TABLE `sinhvien` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-08 16:17:48
