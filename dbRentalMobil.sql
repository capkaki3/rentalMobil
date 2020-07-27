-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 27, 2020 at 03:35 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbRentalMobil`
--

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `NIK` int(20) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Alamat` varchar(150) NOT NULL,
  `notelpon` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`NIK`, `Nama`, `Alamat`, `notelpon`) VALUES
(1234567, 'jojon', 'depok', '089878767656'),
(1234568, 'amin', 'bogor', '08789878723');

-- --------------------------------------------------------

--
-- Table structure for table `kendaraan`
--

CREATE TABLE `kendaraan` (
  `noPlat` varchar(20) NOT NULL,
  `namaKendaraan` varchar(50) NOT NULL,
  `tahun` varchar(20) NOT NULL,
  `Tarif` varchar(10) NOT NULL,
  `statusRental` varchar(10) NOT NULL,
  `namaPemilik` varchar(50) NOT NULL,
  `tipeKendaraan` varchar(20) NOT NULL,
  `merekKendaraan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kendaraan`
--

INSERT INTO `kendaraan` (`noPlat`, `namaKendaraan`, `tahun`, `Tarif`, `statusRental`, `namaPemilik`, `tipeKendaraan`, `merekKendaraan`) VALUES
('B12345HH', 'jaka', '2010', '3000000', 'Tidak', 'Toyota', 'B123', 'ikhsan gustya'),
('B2345KK', 'andi', '2017', '2300000', 'Tidak', 'Mitsubitsi', 'B123', 'muhammad fikri kamal');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(10) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `role` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`, `role`) VALUES
(1, 'kamal1', 'kamal1', 'Admin'),
(2, 'iang1', 'iang1', 'Admin'),
(3, 'yafir1', 'yafir1', 'Admin'),
(4, 'iang2', 'iang2', 'Karyawan'),
(5, 'kamal2', 'kamal2', 'Karyawan'),
(7, 'yafir2', 'yafir2', 'Karyawan'),
(8, 'admin', 'admin', 'Admin'),
(9, 'user', 'user', 'Karyawan');

-- --------------------------------------------------------

--
-- Table structure for table `merekKendaraan`
--

CREATE TABLE `merekKendaraan` (
  `idMerek` int(10) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `merekKendaraan`
--

INSERT INTO `merekKendaraan` (`idMerek`, `Nama`, `Keterangan`) VALUES
(1, 'Toyota', 'Hitam'),
(2, 'Suzuki', 'Putih'),
(3, 'Honda', 'Merah'),
(4, 'Mitsubitsi', 'Abu-abu');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `noKtp` int(20) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Alamat` varchar(150) NOT NULL,
  `notelpon` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`noKtp`, `Nama`, `Alamat`, `notelpon`) VALUES
(1234789, 'pak jaya', 'jakarta', '085678123456'),
(1234798, 'pak budi', 'tangerang', '089676345234'),
(1234876, 'pak sigit', 'serang', '085678456675');

-- --------------------------------------------------------

--
-- Table structure for table `pemilik`
--

CREATE TABLE `pemilik` (
  `noKtp` int(20) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Alamat` varchar(150) NOT NULL,
  `notelpon` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemilik`
--

INSERT INTO `pemilik` (`noKtp`, `Nama`, `Alamat`, `notelpon`) VALUES
(321232, 'ikhsan gustya', 'depok', '087676567765'),
(321233, 'muhammad fikri kamal', 'jakarta', '087676545454'),
(321231, 'iang nugraha', 'bogor', '085676787898');

-- --------------------------------------------------------

--
-- Table structure for table `sopir`
--

CREATE TABLE `sopir` (
  `noSim` int(20) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Alamat` varchar(150) NOT NULL,
  `notelpon` varchar(15) NOT NULL,
  `tarif` varchar(20) NOT NULL,
  `statusRental` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sopir`
--

INSERT INTO `sopir` (`noSim`, `Nama`, `Alamat`, `notelpon`, `tarif`, `statusRental`) VALUES
(987654323, 'udin', 'bogor', '087876565432', '2000000', 'Ya'),
(987654333, 'mamat', 'jakarta', '089765432345', '2000000', 'Tidak'),
(987654345, 'rojak', 'cibinong', '087878676543', '2300000', 'Tidak');

-- --------------------------------------------------------

--
-- Table structure for table `tipeKendaraan`
--

CREATE TABLE `tipeKendaraan` (
  `idTipe` int(10) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tipeKendaraan`
--

INSERT INTO `tipeKendaraan` (`idTipe`, `Nama`, `Keterangan`) VALUES
(1, 'A123', 'Keluarga'),
(2, 'B123', 'Bisnis'),
(3, 'C123', 'Umum');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `idTransaksi` int(10) NOT NULL,
  `noPlat` varchar(10) NOT NULL,
  `namaKendaraan` varchar(50) NOT NULL,
  `tarif` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
