-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 11, 2024 at 09:37 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projekuas`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kdbrg` varchar(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `hrgbeli` int(12) NOT NULL,
  `hrgjual` int(12) NOT NULL,
  `stok` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kdbrg`, `nama`, `hrgbeli`, `hrgjual`, `stok`) VALUES
('BR01', 'Aroma Bold', 19000, 21000, 200),
('BR02', 'Camel Purple', 28000, 30000, 200),
('BR03', 'Sukun', 20000, 22000, 200);

-- --------------------------------------------------------

--
-- Table structure for table `jual`
--

CREATE TABLE `jual` (
  `no_transaksi` varchar(11) NOT NULL,
  `kode_pelanggan` varchar(11) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `total` int(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jual`
--

INSERT INTO `jual` (`no_transaksi`, `kode_pelanggan`, `tanggal`, `total`) VALUES
('TR0001', 'P01', '2024-07-03', 900000),
('TR0002', 'P01', '2024-07-03', 900000),
('TR0003', 'P01', '2024-07-17', 60000),
('TR0004', 'P01', '2024-07-31', 240000);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `kdpelanggan` varchar(11) NOT NULL,
  `nama_pelanggan` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `telepon` varchar(14) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`kdpelanggan`, `nama_pelanggan`, `alamat`, `telepon`) VALUES
('P01', 'Atha Pel', 'Grajegan', '0812298976');

-- --------------------------------------------------------

--
-- Table structure for table `penjualanrinci`
--

CREATE TABLE `penjualanrinci` (
  `no_transaksi` varchar(11) NOT NULL,
  `kdbrg` varchar(11) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `harga` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` varchar(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `Tanggal_buat` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `nama`, `password`, `Tanggal_buat`) VALUES
('US01', 'Atha', 'atha123', '2024-07-11'),
('US02', 'Atha 2', 'atha123', '2024-07-11'),
('US03', 'Atha 3', 'atha123', '2024-07-11');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kdbrg`);

--
-- Indexes for table `jual`
--
ALTER TABLE `jual`
  ADD PRIMARY KEY (`no_transaksi`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`kdpelanggan`);

--
-- Indexes for table `penjualanrinci`
--
ALTER TABLE `penjualanrinci`
  ADD PRIMARY KEY (`no_transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
