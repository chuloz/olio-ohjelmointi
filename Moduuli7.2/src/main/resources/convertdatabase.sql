DROP DATABASE IF EXISTS Currency;
CREATE DATABASE Currency;
USE Currency;

CREATE TABLE CURRENT (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         abbreviation VARCHAR(3) NOT NULL,
                         name VARCHAR(50) NOT NULL,
                         rate FLOAT NOT NULL
);

INSERT INTO CURRENT (abbreviation, name, rate) VALUES
                                                   ('USD', 'United States Dollar', 1.00),
                                                   ('EUR', 'Euro', 0.85),
                                                   ('GBP', 'British Pound', 0.76),
                                                   ('JPY', 'Japanese Yen', 113.41),
                                                   ('CNY', 'Chinese Yuan', 6.63),
                                                   ('INR', 'Indian Rupee', 64.93),
                                                   ('AUD', 'Australian Dollar', 1.30),
                                                   ('CAD', 'Canadian Dollar', 1.28),
                                                   ('SGD', 'Singapore Dollar', 1.35),
                                                   ('CHF', 'Swiss Franc', 0.99),
                                                   ('MYR', 'Malaysian Ringgit', 4.14),
                                                   ('THB', 'Thai Baht', 33.24),
                                                   ('IDR', 'Indonesian Rupiah', 13472.50),
                                                   ('KRW', 'South Korean Won', 1128.50),
                                                   ('SAR', 'Saudi Riyal', 3.75),
                                                   ('AED', 'United Arab Emirates Dirham', 3.67),
                                                   ('MXN', 'Mexican Peso', 19.07),
                                                   ('BRL', 'Brazilian Real', 3.26),
                                                   ('ZAR', 'South African Rand', 14.33),
                                                   ('RUB', 'Russian Ruble', 58.08),
                                                   ('TRY', 'Turkish Lira', 3.85),
                                                   ('NZD', 'New Zealand Dollar', 1.40),
                                                   ('SEK', 'Swedish Krona', 8.41),
                                                   ('NOK', 'Norwegian Krone', 8.12),
                                                   ('DKK', 'Danish Krone', 6.30),
                                                   ('HKD', 'Hong Kong Dollar', 7.80),
                                                   ('TWD', 'Taiwan New Dollar', 30.85),
                                                   ('PLN', 'Polish Zloty', 3.55),
                                                   ('CZK', 'Czech Koruna', 21.80),
                                                   ('HUF', 'Hungarian Forint', 263.00),
                                                   ('ILS', 'Israeli Shekel', 3.52),
                                                   ('PHP', 'Philippine Peso', 50.50),
                                                   ('EGP', 'Egyptian Pound', 17.64),
                                                   ('ARS', 'Argentine Peso', 17.64);

DROP USER IF EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';
GRANT SELECT ON Currency.* TO 'appuser'@'localhost';