-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 17, 2014 at 11:15 AM
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `fruits`
--

-- --------------------------------------------------------

--
-- Table structure for table `info`
--

CREATE TABLE IF NOT EXISTS `info` (
  `name` varchar(10) NOT NULL,
  `totalplay` int(255) NOT NULL,
  `totalwon` int(255) NOT NULL,
  `totalloss` int(255) NOT NULL,
  `abandon` int(255) NOT NULL,
  `bsc` int(255) NOT NULL,
  `mt` int(255) NOT NULL,
  `process` int(255) NOT NULL,
  `others` int(255) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `info`
--

INSERT INTO `info` (`name`, `totalplay`, `totalwon`, `totalloss`, `abandon`, `bsc`, `mt`, `process`, `others`) VALUES
('lav1', 0, 0, 0, 0, 0, 0, 0, 0),
('lav2', 0, 0, 0, 0, 0, 0, 0, 0),
('lav3', 0, 0, 0, 0, 0, 0, 0, 0),
('lav4', 0, 0, 0, 0, 0, 0, 0, 0),
('lav5', 0, 0, 0, 0, 0, 0, 0, 0),
('lav6', 0, 0, 0, 0, 0, 0, 0, 0),
('extra', 0, 0, 0, 0, 0, 0, 0, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
