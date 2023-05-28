
CREATE schema PIMS;

USE PIMS;

create table PIMS.Inventory 
(
    Item_ID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Formula VARCHAR(255) NULL,
    Company VARCHAR(255) NOT NULL,
    ExpDate DATE NOT NULL,
    MfgDate DATE NOT NULL,
    Qty INT NOT NULL,
    Item_Type VARCHAR(255) NOT NULL
);

CREATE TABLE PIMS.Accounts
(
	username VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255) NOT NULL,
    accountType VARCHAR(255) NOT NULL
);

CREATE TABLE PIMS.Employees
(
	Emp_ID INT PRIMARY KEY AUTO_INCREMENT,
    First_Name VARCHAR(255),
    Last_Name VARCHAR(255)
);

CREATE TABLE PIMS.Reports
(
	Rep_ID INT PRIMARY KEY AUTO_INCREMENT,
    Content VARCHAR(255)
);

-- Inserting data into PIMS.Inventory
INSERT INTO PIMS.Inventory VALUES
(DEFAULT, 'Aspirin', 'C9H8O4', 'Bayer', '2024-12-31', '2021-01-01', 6, 'Medicine'),
(DEFAULT, 'Lipstick', NULL, 'LOreal', '2023-06-30', '2020-07-01', 5, 'Cosmetic'),
(DEFAULT, 'Chocolate', NULL, 'Nestle', '2022-03-31', '2021-09-01', 7, 'Eatable'),
(DEFAULT, 'Paracetamol', 'C8H9NO2', 'Johnson & Johnson', '2025-01-31', '2021-02-01', 9, 'Medicine'),
(DEFAULT, 'Mascara', NULL, 'Maybelline', '2023-09-30', '2020-10-01', 11, 'Cosmetic'),
(DEFAULT, 'Cheese', NULL, 'Kraft', '2022-06-30', '2021-12-01', 4, 'Eatable');

-- Inserting data into PIMS.Accounts
INSERT INTO PIMS.Accounts VALUES
('alice', '1234', 'Pharmacist'),
('bob', '5678', 'Manager'),
('charlie', '9012', 'Salesman'),
('david', '3456', 'Pharmacist'),
('eve', '7890', 'Manager'),
('frank', '1230', 'Salesman');

-- Inserting data into PIMS.Employees
INSERT INTO PIMS.Employees VALUES
(DEFAULT, 'Ali', 'Khan'),
(DEFAULT, 'Fatima', 'Ahmed'),
(DEFAULT, 'Omar', 'Hassan'),
(DEFAULT, 'Aisha', 'Malik'),
(DEFAULT, 'Yusuf', 'Rahman'),
(DEFAULT, 'Zara', 'Iqbal');

-- Inserting data into PIMS.Reports
INSERT INTO PIMS.Reports VALUES
(DEFAULT, 'Monthly inventory of drugs and supplies'),
(DEFAULT, 'Weekly sales report of over-the-counter products'),
(DEFAULT, 'Quarterly performance review of pharmacy staff'),
(DEFAULT, 'Annual budget plan and forecast for the next fiscal year'),
(DEFAULT, 'Customer satisfaction survey and feedback analysis'),
(DEFAULT, 'Pharmacy safety and compliance audit report');