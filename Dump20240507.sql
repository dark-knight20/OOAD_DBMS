CREATE DATABASE  IF NOT EXISTS `employee_survey` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `employee_survey`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: employee_survey
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `answer_options`
--

DROP TABLE IF EXISTS `answer_options`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `answer_options` (
  `id` int NOT NULL AUTO_INCREMENT,
  `question_id` int DEFAULT NULL,
  `option_text` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `question_id` (`question_id`),
  CONSTRAINT `answer_options_ibfk_1` FOREIGN KEY (`question_id`) REFERENCES `question` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answer_options`
--

LOCK TABLES `answer_options` WRITE;
/*!40000 ALTER TABLE `answer_options` DISABLE KEYS */;
INSERT INTO `answer_options` VALUES (7,5,'Fine'),(8,5,'Not Fine'),(9,6,'Yes'),(10,6,'No'),(11,7,'Very satisfied'),(12,7,'Satisfied'),(13,7,'Neutral'),(14,7,'Dissatisfied'),(15,7,'Very dissatisfied'),(16,8,'Excellent'),(17,8,'Good'),(18,8,'Fair'),(19,8,'Poor'),(20,8,'Very poor'),(21,9,'Yes'),(22,9,'No'),(23,10,'Definitely'),(24,10,'Probably'),(25,10,'Not sure'),(26,10,'Probably not'),(27,10,'Definitely not'),(28,11,'Very satisfied'),(29,11,'Satisfied'),(30,11,'Neutral'),(31,11,'Dissatisfied'),(32,11,'Very dissatisfied'),(33,12,'Improved performance'),(34,12,'Better customer service'),(35,12,'More advanced tools'),(36,12,'Other (please specify)'),(37,13,'Yes, definitely'),(38,13,'Yes, somewhat'),(39,13,'No, not really'),(40,13,'No, not at all'),(41,14,'Leadership skills'),(42,14,'Technical skills'),(43,14,'Communication skills'),(44,14,'Problem-solving skills'),(45,15,'Good'),(46,15,'Satisfactory'),(47,15,'Fine'),(48,15,'Bad'),(49,16,'Lakshmi'),(50,16,'Suneesh');
/*!40000 ALTER TABLE `answer_options` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'Learning and Development'),(2,'Human Resource'),(3,'SFM'),(4,'Software Development'),(5,'Research and Development'),(6,'Marketing'),(7,'UI/IX Design'),(8,'Finance and Accounting'),(9,'Management'),(10,'Quality Assurance');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `department_id` int DEFAULT NULL,
  `position_id` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `joining_date` date DEFAULT NULL,
  `phn_no` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `department_id` (`department_id`),
  KEY `position_id` (`position_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`),
  CONSTRAINT `employee_ibfk_2` FOREIGN KEY (`position_id`) REFERENCES `position` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,4,1,'Joel Joseph Jude',22,'Kochi','2024-04-15',9882738891),(4,1,13,'Anish Kora',24,'Kottayam','2021-10-12',9878233291),(5,4,3,'Varkey Njaliyath',23,'Kochi','2023-12-19',7900453291),(6,1,17,'Reshmi R',24,'Varkala','2022-03-24',6552567291);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `position`
--

DROP TABLE IF EXISTS `position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `position` (
  `id` int NOT NULL AUTO_INCREMENT,
  `position_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `position`
--

LOCK TABLES `position` WRITE;
/*!40000 ALTER TABLE `position` DISABLE KEYS */;
INSERT INTO `position` VALUES (1,'Software Architect'),(2,'DevOps Engineer'),(3,'QA Engineer'),(4,'Project Manager'),(5,'Research Engineer'),(6,'Research Scientist'),(7,'UX Designer'),(8,'UI Designer'),(9,'Marketing Manager'),(10,'Sales Representative'),(11,'Product Marketing Manager'),(12,'HR Manager'),(13,'Recruiter'),(14,'Accountant'),(15,'Chief Financial Officer'),(16,'Training Manager'),(17,'Learning and Development Specialist');
/*!40000 ALTER TABLE `position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question` (
  `id` int NOT NULL AUTO_INCREMENT,
  `survey_id` int DEFAULT NULL,
  `question_text` varchar(255) DEFAULT NULL,
  `created_on` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `survey_id` (`survey_id`),
  CONSTRAINT `question_ibfk_1` FOREIGN KEY (`survey_id`) REFERENCES `survey` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (5,1,'How are you?','2023-12-12 18:30:00'),(6,1,'Do you like experion?','2023-12-12 18:30:00'),(7,5,'How satisfied are you with your current role?','2024-05-03 07:59:29'),(8,5,'How would you rate the work environment?','2024-05-03 07:59:29'),(9,6,'Did you find the training sessions helpful?','2024-05-03 07:59:29'),(10,6,'Would you recommend these training programs to others?','2024-05-03 07:59:29'),(11,7,'How satisfied are you with our latest product?','2024-05-03 08:47:04'),(12,7,'What features would you like to see in our next product?','2024-05-03 08:47:04'),(13,8,'Do you feel you have received adequate training for your role?','2024-05-03 08:47:04'),(14,8,'What additional training would you like to receive?','2024-05-03 08:47:04'),(15,10,'How was the trainig program','2024-04-11 18:30:00'),(16,10,'You favorite  Trainer','2024-04-11 18:30:00');
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `response`
--

DROP TABLE IF EXISTS `response`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `response` (
  `id` int NOT NULL AUTO_INCREMENT,
  `question_id` int DEFAULT NULL,
  `employee_id` int DEFAULT NULL,
  `response_value` varchar(255) DEFAULT NULL,
  `status` enum('Completed','Not Completed') DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `employee_id` (`employee_id`),
  KEY `question_id` (`question_id`),
  CONSTRAINT `response_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `response_ibfk_2` FOREIGN KEY (`question_id`) REFERENCES `question` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `response`
--

LOCK TABLES `response` WRITE;
/*!40000 ALTER TABLE `response` DISABLE KEYS */;
INSERT INTO `response` VALUES (2,5,1,'Fine','Completed'),(3,5,1,'Not Fine','Completed'),(4,5,4,'Not Fine','Completed'),(5,5,5,'Not Fine','Completed'),(6,5,6,'Not Fine','Completed'),(17,5,4,'7','Completed'),(18,6,4,'10','Completed'),(27,7,4,'Very satisfied','Completed'),(28,8,4,'Excellent','Completed'),(29,7,5,'Satisfied','Completed'),(30,8,5,'Good','Completed'),(31,7,5,'Neutral','Not Completed'),(32,8,4,'Fair','Not Completed'),(33,7,6,'Dissatisfied','Completed'),(34,8,6,'Poor','Completed'),(35,9,5,'','Completed'),(36,10,5,'Not Sure','Completed'),(37,11,4,'Satisfied','Completed'),(38,11,5,'Very satisfied','Completed'),(39,12,4,'More advanced tools','Completed'),(40,12,5,'Improved performance','Completed'),(41,13,6,'Yes, definitely','Completed'),(42,13,4,'Yes, somewhat','Completed'),(43,14,6,'Technical skills','Not Completed'),(44,14,5,'Problem-solving skills','Not Completed'),(45,5,1,'','Completed'),(46,6,1,'Fine','Completed'),(47,15,1,'','Completed'),(48,16,1,'Lakshmi','Completed');
/*!40000 ALTER TABLE `response` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `survey`
--

DROP TABLE IF EXISTS `survey`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `survey` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `creator_id` int DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `creator_id` (`creator_id`),
  CONSTRAINT `survey_ibfk_1` FOREIGN KEY (`creator_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `survey`
--

LOCK TABLES `survey` WRITE;
/*!40000 ALTER TABLE `survey` DISABLE KEYS */;
INSERT INTO `survey` VALUES (1,'HR Survey','Sample survey for HR department',1,'2023-12-13','2023-12-14'),(2,'Club Survey','Sample Club survey',1,'2023-12-13','2023-12-14'),(5,'Employee Satisfaction Survey','Survey to gauge employee satisfaction levels',1,'2024-04-01','2024-04-30'),(6,'Training Feedback Survey','Survey to collect feedback on training programs',1,'2024-03-15','2024-04-15'),(7,'Product Feedback Survey','Survey to gather feedback on new products',1,'2024-05-01','2024-05-31'),(8,'Training Needs Assessment','Survey to identify training needs of employees',1,'2024-04-15','2024-05-15'),(9,'ILP program','ILP prohram for freshers',1,'2023-12-13','2023-12-14'),(10,'Training Feedback','Training feedback form',1,'2024-04-10','2024-04-11');
/*!40000 ALTER TABLE `survey` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-07 11:48:03
