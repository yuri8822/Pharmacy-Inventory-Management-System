
CREATE schema PIMS;

USE PIMS;

create table PIMS.Inventory 
(
    Item_ID INT PRIMARY KEY,
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

-- Inserting data into PIMS.Inventory
INSERT INTO PIMS.Inventory VALUES
(1, 'Aspirin', 'C9H8O4', 'Bayer', '2024-12-31', '2021-01-01', 6, 'Medicine'),
(2, 'Lipstick', NULL, 'LOreal', '2023-06-30', '2020-07-01', 5, 'Cosmetic'),
(3, 'Chocolate', NULL, 'Nestle', '2022-03-31', '2021-09-01', 7, 'Eatable'),
(4, 'Paracetamol', 'C8H9NO2', 'Johnson & Johnson', '2025-01-31', '2021-02-01', 9, 'Medicine'),
(5, 'Mascara', NULL, 'Maybelline', '2023-09-30', '2020-10-01', 11, 'Cosmetic'),
(6, 'Cheese', NULL, 'Kraft', '2022-06-30', '2021-12-01', 4, 'Eatable');

-- Inserting data into PIMS.Accounts
INSERT INTO PIMS.Accounts VALUES
('alice', '1234', 'Pharmacist'),
('bob', '5678', 'Manager'),
('charlie', '9012', 'Salesman'),
('david', '3456', 'Pharmacist'),
('eve', '7890', 'Manager'),
('frank', '1230', 'Salesman');
