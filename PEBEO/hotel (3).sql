-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 30 Nov 2017 pada 05.12
-- Versi Server: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `bersih`
--

CREATE TABLE `bersih` (
  `kamar` varchar(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `bersih`
--

INSERT INTO `bersih` (`kamar`) VALUES
('2'),
('6');

-- --------------------------------------------------------

--
-- Struktur dari tabel `booked`
--

CREATE TABLE `booked` (
  `nama` varchar(35) NOT NULL,
  `email` varchar(35) NOT NULL,
  `nohp` varchar(15) NOT NULL,
  `tanggallahir` varchar(7) NOT NULL,
  `noktp` varchar(35) NOT NULL,
  `kamar` varchar(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `booked`
--

INSERT INTO `booked` (`nama`, `email`, `nohp`, `tanggallahir`, `noktp`, `kamar`) VALUES
('Afa', 'afa_fadhlika', '0008203', 'a', '330123081', '1'),
('Wisma Annisya Caesara', 'ann.@gmailcom', '085399831098', '050598', '33210390123809', '5'),
('Wahyu', 'mama', '02930', '0320', '03901293', '4');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kamar`
--

CREATE TABLE `kamar` (
  `nokamar` varchar(15) NOT NULL,
  `id` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `penginap`
--

CREATE TABLE `penginap` (
  `nama` varchar(35) NOT NULL,
  `id` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `email` varchar(35) NOT NULL,
  `nohp` varchar(15) NOT NULL,
  `tanggallahir` varchar(7) NOT NULL,
  `noktp` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penginap`
--

INSERT INTO `penginap` (`nama`, `id`, `password`, `email`, `nohp`, `tanggallahir`, `noktp`) VALUES
('a', 'a', 'aa', 'a', 'aa', 'a', 'a'),
('Wisma Annisya Caesara', 'ann', 'himawari', 'ann.@gmailcom', '085399831098', '050598', '33210390123809'),
('Afa', 'citrayaf', 'cyaf9814', 'afa_fadhlika', '0008203', 'a', '330123081');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ruang`
--

CREATE TABLE `ruang` (
  `nama` varchar(35) NOT NULL,
  `email` varchar(35) NOT NULL,
  `nohp` varchar(15) NOT NULL,
  `tanggallahir` varchar(7) NOT NULL,
  `noktp` varchar(35) NOT NULL,
  `kamar` varchar(35) DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `ruang`
--

INSERT INTO `ruang` (`nama`, `email`, `nohp`, `tanggallahir`, `noktp`, `kamar`, `status`) VALUES
('', '', '', '', '', '2', 'kosong'),
('', '', '', '', '', '6', 'kosong'),
(' ', ' ', ' ', ' ', ' ', '5', 'isi'),
(' ', ' ', ' ', ' ', ' ', '4', 'kosong'),
('', '', '', '', '', '3', 'kosong'),
(' ', ' ', ' ', ' ', ' ', '1', 'isi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booked`
--
ALTER TABLE `booked`
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `noktp` (`noktp`);

--
-- Indexes for table `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`nokamar`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `penginap`
--
ALTER TABLE `penginap`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD UNIQUE KEY `password` (`password`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `noktp` (`noktp`);

--
-- Indexes for table `ruang`
--
ALTER TABLE `ruang`
  ADD UNIQUE KEY `kamar` (`kamar`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `kamar`
--
ALTER TABLE `kamar`
  ADD CONSTRAINT `kamar_ibfk_1` FOREIGN KEY (`id`) REFERENCES `penginap` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
