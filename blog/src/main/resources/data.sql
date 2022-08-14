    CREATE TABLE `authors` (
  `username` varchar(30) NOT NULL,
  `password` varchar(60) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `email` varchar(100),
  `birth_date` date NOT NULL,
  `added` timestamp,
  PRIMARY KEY (`username`)
);

CREATE TABLE `posts` (
  `id` int NOT NULL AUTO_INCREMENT,
  `author` varchar(30) NOT NULL,
  `title` varchar(255) NOT NULL,
  `description` varchar(500) NOT NULL,
  `content` text,
  `created_at` timestamp,
  PRIMARY KEY (`id`)
);

INSERT INTO authors (username, password, first_name, last_name, email, birth_date, added) VALUES ('vangdo', '1709', 'Vang', 'Do', 'vangdo@gmail.com', CURRENT_DATE(), CURRENT_TIMESTAMP());
INSERT INTO authors (username, password, first_name, last_name, email, birth_date, added) VALUES ('vietvu', '1234', 'Viet', 'Vu', 'vietvuhoang@gmail.com', CURRENT_DATE(), CURRENT_TIMESTAMP());
INSERT INTO authors (username, password, first_name, last_name, email, birth_date, added) VALUES ('tuando', '1505', 'Tuan', 'Do', 'tuando@gmail.com', CURRENT_DATE(), CURRENT_TIMESTAMP());

INSERT INTO posts ( author, title, description, content, created_at) VALUES ('vietvu', 'Spring MVC Rookie', 'Hello world, Spring MVC', 'A Spring MVC is a Java framework which is used to build web applications', CURRENT_TIMESTAMP());
INSERT INTO posts ( author, title, description, content, created_at) VALUES ('vangdo', 'Spring Framework', 'Hello world, Spring Framework', 'The Spring Framework provides a comprehensive programming and configuration model for modern Java-based enterprise applications', CURRENT_TIMESTAMP());
INSERT INTO posts ( author, title, description, content, created_at) VALUES ('vietvu', 'Java OOP', 'Hello world, Java OOP', 'Java - What is OOP? OOP stands for Object-Oriented Programming. Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.', CURRENT_TIMESTAMP());
