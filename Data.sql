
create schema PIMS;

create table pims.Medicine (
    MedID INT PRIMARY KEY,
    MedName VARCHAR(255) NOT NULL,
    Formula VARCHAR(255) NOT NULL,
    BatchNo INT
);

CREATE TABLE pims.Accounts (
	username VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255) NOT NULL,
    accountType ENUM('Admin', 'Manager', 'Pharmacist', 'Salesman')    
);

INSERT INTO pims.Medicine VALUES
 (1, 'Panadol', 'Paracetomol', 1),
 (2, 'Strepsil', 'lozenges', 1);

INSERT INTO pims.Accounts VALUES
 ('Umar123', '1234', 'Admin'),
 ('Talal', '2468', 'Manager');
