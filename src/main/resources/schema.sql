CREATE TABLE employee (
    employee_Id bigint NOT NULL,
    employee_Name varchar(100) NOT NULL,
    employee_Email varchar(100) DEFAULT NULL,
    employee_Address varchar(100) DEFAULT NULL,
    PRIMARY KEY (employee_Id)
);