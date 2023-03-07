
create schema PIMS;

create table pims.Medicine (
    MedID INT PRIMARY KEY,
    MedName VARCHAR(255) NOT NULL,
    Formula VARCHAR(255) NOT NULL,
    BatchNo INT
);

INSERT INTO pims.Medicine VALUES ( 1, 'Panadol', 'Paracetomol', 1);
INSERT INTO pims.Medicine VALUES ( 2, 'Strepsil', 'lozenges', 1);

