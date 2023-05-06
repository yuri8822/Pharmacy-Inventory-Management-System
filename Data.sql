
CREATE schema PIMS;

USE PIMS;

create table PIMS.Inventory 
(
    Unit_ID INT PRIMARY KEY,
    Name VARCHAR(255) NULL,
    Formula VARCHAR(255) NULL,
    BatchNo INT NULL,
    Unit_Type VARCHAR(255) NOT NULL
);

CREATE TABLE PIMS.Accounts 
(
	username VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255) NOT NULL,
    accountType ENUM('Admin', 'Manager', 'Pharmacist', 'Salesman')    
);

INSERT INTO PIMS.Medicine VALUES
 (1, 'Panadol', 'Paracetomol', 1, "Medicine"),
 (2, 'Strepsil', 'lozenges', 1, "Medicine");

INSERT INTO PIMS.Accounts VALUES
 ('Umar123', '1234', 'Pharmacist'),
 ('Talal', '2468', 'Manager');