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
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `judul` varchar(45) NOT NULL,
  `penulis` varchar(45) NOT NULL,
  `penerbit` varchar(45) NOT NULL,
  `tahun` varchar(45) NOT NULL,
  `serial` varchar(46) NOT NULL,
  `jumlah` varchar(45) NOT NULL,
  `letak` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`judul`, `penulis`, `penerbit`, `tahun`, `serial`, `jumlah`, `letak`) VALUES
('Polar', 'asd', 'kjeer', '2134', 'BCH23', '43', 'M1'),
('LDPC', 'asd', 'kiol', '3023', 'LEC4S', '21', 'X1');

-- --------------------------------------------------------

--
-- Table structure for table `dipinjam`
--

CREATE TABLE `dipinjam` (
  `pnama` varchar(46) NOT NULL,
  `pserial` varchar(46) NOT NULL,
  `tglpin` varchar(36) NOT NULL,
  `tglkem` varchar(36) NOT NULL,
  `tglden` varchar(36) NOT NULL,
  `denda` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `nama` varchar(45) NOT NULL,
  `id` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `hp` varchar(45) NOT NULL,
  `tgl` varchar(45) NOT NULL,
  `ktp` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`nama`, `id`, `pass`, `email`, `hp`, `tgl`, `ktp`) VALUES
('citra yasin akbar fadhlika', 'fadhlika14', 'cyaf9814', 'afa_fadhlika@yahoo.co.id', '085799771159', '1998-01-14', '129839817248');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD UNIQUE KEY `serial` (`serial`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
