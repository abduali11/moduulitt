DROP DATABASE IF exists convertdatabase;
CREATE DATABASE convertdatabase;
USE convertdatabase;
CREATE TABLE currencies(
id INT NOT NULL AUTO_INCREMENT,
abbreviation VARCHAR (50) NOT NULL,
nimet VARCHAR(50) NOT NULL,
rate DECIMAL (10,2) NOT NULL,
PRIMARY KEY (id)
);

INSERT INTO currencies(abbreviation,Nimet , rate ) VALUES
('EUR', 'Euro', 1.00),
('USD', 'United States Dollar', 1.12),
('JPY', 'Japanese Yen', 0.0084),
('GBP', 'British Pound ', 1.38),
('AUD', 'Australian Dollar', 0.77),
('CAD', 'Canadian Dollar', 0.79),
('CHF', 'Swiss Franc', 1.09),
('CNY', 'Chinese Yuan', 0.16);

DROP USER IF EXISTS 'appuser1'@'localhost';
CREATE USER 'appuser1'@'localhost' IDENTIFIED BY 'password';
GRANT SELECT ON convertdatabase.* TO 'appuser1'@'localhost';