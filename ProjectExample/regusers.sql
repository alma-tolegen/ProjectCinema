-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1
-- Время создания: Май 08 2020 г., 12:59
-- Версия сервера: 10.4.11-MariaDB
-- Версия PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `input`
--

-- --------------------------------------------------------

--
-- Структура таблицы `regusers`
--

CREATE TABLE `regusers` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `login` varchar(20) NOT NULL,
  `password1` varchar(20) NOT NULL,
  `password2` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Дамп данных таблицы `regusers`
--

INSERT INTO `regusers` (`id`, `name`, `surname`, `login`, `password1`, `password2`) VALUES
(1, 'Alma', 'Murzabekova', 'alma', 'alma', 'alma'),
(2, 'Tolegen', 'Kanat', 'tolegen', 'tolegen', 'tolegen'),
(3, 'Bekzat', 'Murzabek', 'bekzat', 'bekzat', 'bekzat'),
(4, 'a', 'a', 'a', 'a', 'a'),
(6, 'Nazym', 'Mailaubaeva', 'nazym', 'nazym', 'nazym'),
(7, 'qwerty', 'asdfg', 'qwe', 'qwerty', 'qwerty'),
(8, 'admin', 'admin', 'admin', '12345', '12345');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `regusers`
--
ALTER TABLE `regusers`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `regusers`
--
ALTER TABLE `regusers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
