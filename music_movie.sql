-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 25, 2023 at 07:47 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `music_movie`
--

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `feedback_id` int(11) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `category` varchar(25) NOT NULL,
  `comment` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`feedback_id`, `Email`, `category`, `comment`) VALUES
(1, 'n.sheikh0101@gmail.com', 'movies', 'very noice movie'),
(2, 'n.sheikh0101@gmail.comjj', 'movie', 'this is awesomeee');

-- --------------------------------------------------------

--
-- Table structure for table `info`
--

CREATE TABLE `info` (
  `name` varchar(30) NOT NULL,
  `genre` varchar(20) NOT NULL,
  `status` varchar(10) NOT NULL,
  `category` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `info`
--

INSERT INTO `info` (`name`, `genre`, `status`, `category`) VALUES
('jawan', 'action', 'movie', 'bollywood'),
('o man jahan', 'family', 'movie', 'lollywood'),
(' 3 idiots', 'comedy', 'movie', 'bollywood'),
('let it go', 'romance', 'music', 'hollywood'),
('challeya', 'pop', 'music', 'bollywood'),
('sanju', 'strategy', 'movie', 'bollywood'),
('pathan', 'action', 'movie', 'bollywood'),
('endgame', 'action', 'movie', 'hollywood'),
('baarishain', 'sad', 'music', 'bollywood'),
('husn', 'sad', 'music', 'bollywood'),
('jawan', 'action', 'movie', 'bollywood'),
('dunki', 'action', 'movie', 'bollywood'),
('maula jutt', 'action', 'movie', 'lollywood'),
('heeriye', 'action', 'music', 'bollywood'),
('tu hai kahan', 'action', 'music', 'bollywood');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `ID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`feedback_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `feedback`
--
ALTER TABLE `feedback`
  MODIFY `feedback_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
