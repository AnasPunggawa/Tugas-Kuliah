-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2021 at 11:01 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `crud-ci3`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_robotik`
--

CREATE TABLE `data_robotik` (
  `id` int(5) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `sekolah` varchar(100) NOT NULL,
  `kelas` varchar(100) NOT NULL,
  `nohp` varchar(20) NOT NULL,
  `usia` int(2) NOT NULL,
  `waktu` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_robotik`
--

INSERT INTO `data_robotik` (`id`, `nama`, `sekolah`, `kelas`, `nohp`, `usia`, `waktu`) VALUES
(1, 'Muhammad Anas Punggawa', 'MTs. Binamu', 'IX', '085242019835', 15, '2021-12-01 05:51:55');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_robotik`
--
ALTER TABLE `data_robotik`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_robotik`
--
ALTER TABLE `data_robotik`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
