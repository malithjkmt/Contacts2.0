CREATE DATABASE  IF NOT EXISTS `contacts3` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `contacts3`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: contacts3
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `FirstName` varchar(20) DEFAULT NULL,
  `LastName` varchar(45) DEFAULT NULL,
  `Group` varchar(30) DEFAULT NULL,
  `Tags` varchar(45) DEFAULT NULL,
  `NIC` varchar(45) NOT NULL,
  `Sex` varchar(45) DEFAULT NULL,
  `MobileOne` varchar(12) DEFAULT NULL,
  `MobileTwo` varchar(12) DEFAULT NULL,
  `Home` varchar(12) DEFAULT NULL,
  `Office` varchar(12) DEFAULT NULL,
  `Fax` varchar(12) DEFAULT NULL,
  `PersonalAddress` varchar(100) DEFAULT NULL,
  `OfficeAddress` varchar(100) DEFAULT NULL,
  `Business` varchar(20) DEFAULT NULL COMMENT 'What is the business, eg:- pharmacy, butcher',
  `Notes` varchar(400) DEFAULT NULL,
  `BirthDay` varchar(45) DEFAULT NULL,
  `AccountNumber` varchar(17) DEFAULT NULL,
  `NickName` varchar(20) DEFAULT NULL,
  `Branch` varchar(20) DEFAULT NULL,
  `CIFno` varchar(10) DEFAULT NULL,
  `EmailPersonal` varchar(45) DEFAULT NULL,
  `EmailBusiness` varchar(45) DEFAULT NULL,
  `WebPagePersonal` varchar(45) DEFAULT NULL,
  `WebPageBusiness` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`NIC`),
  UNIQUE KEY `NIC_UNIQUE` (`NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` (`FirstName`, `LastName`, `Group`, `Tags`, `NIC`, `Sex`, `MobileOne`, `MobileTwo`, `Home`, `Office`, `Fax`, `PersonalAddress`, `OfficeAddress`, `Business`, `Notes`, `BirthDay`, `AccountNumber`, `NickName`, `Branch`, `CIFno`, `EmailPersonal`, `EmailBusiness`, `WebPagePersonal`, `WebPageBusiness`) VALUES ('Malith','Thialakarathne ','Friends','Loan','931222058v','Male','0777203574','0720713644','0342247844','0112212345','0117789654','No 09,\n2nd Lane,\nSri Sumangala Road,\nMatugama.','Moratuwa','Bit Lab Solutions','','1/5/1993','07020013202','Malith','Matugama','','malit.tilak@gmail.com','bitlabmail@gmail.com','www.malith.com','www.bitlabs.com');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-21  6:53:28
