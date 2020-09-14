-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2019 at 09:48 AM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `laundri`
--

-- --------------------------------------------------------

--
-- Table structure for table `basis`
--

CREATE TABLE `basis` (
  `serial` varchar(100) NOT NULL,
  `nama` varchar(46) NOT NULL,
  `berat` varchar(46) NOT NULL,
  `harga` varchar(46) NOT NULL,
  `tglt` varchar(46) NOT NULL,
  `tgla` varchar(46) NOT NULL,
  `alamat` varchar(46) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `milik`
--

CREATE TABLE `milik` (
  `tgl` varchar(36) NOT NULL,
  `pemasukan` varchar(36) NOT NULL,
  `total` varchar(36) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `milik`
--

INSERT INTO `milik` (`tgl`, `pemasukan`, `total`) VALUES
('2018-11-29', '16000', '16000'),
('2018-11-29', '16000', '32000'),
('2018-12-06', '112000', '144000'),
('2018-11-28', '50000', '194000'),
('2018-12-06', '211000', '405000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
