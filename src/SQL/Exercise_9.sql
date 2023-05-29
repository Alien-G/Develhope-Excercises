CREATE TABLE Customers (
 customer_id INT AUTO_INCREMENT,
 first_name VARCHAR(255),
 last_name VARCHAR(255),
 PRIMARY KEY (customer_id)
);
INSERT INTO Customers (first_name, last_name)
VALUES ('Mario', 'Rossi'),

INSERT INTO Customers (first_name, last_name)
VALUES ('Federico', 'Bianchi');

INSERT INTO Customers (first_name, last_name)
VALUES ('Andrea', 'Cerrelli');

UPDATE Customers
SET first_name = 'Drew'
WHERE customer_id = 3;

DELETE FROM Customers
WHERE customer_id = 1;

TRUNCATE TABLE Customers;

-- Look at the tables below and write which column(s) you think would make a good primary key.

-- 6. Question: customer_id would be a good choice as it is an unique identifier.

CREATE TABLE Customers (
 customer_id INT AUTO_INCREMENT,
 first_name VARCHAR(255) NOT NULL,
 last_name VARCHAR(255) NOT NULL,
 email VARCHAR(255) NOT NULL,
 PRIMARY KEY (customer_id)
);

-- 7. Question: as there isn't an unique one, all the keys should be primary keys.

CREATE TABLE Products (
 product_name VARCHAR(255) NOT NULL,
 product_description VARCHAR(255) NOT NULL,
 product_price DECIMAL(10, 2) NOT NULL,
 product_quantity INT NOT NULL
);

-- 8. Question: order_id, being auto-incrementing guarantees an unique identifier, therefore being the best choice.

CREATE TABLE Orders (
 order_id INT NOT NULL AUTO_INCREMENT,
 customer_id INT NOT NULL,
 expected_arrival_time DATE
);

-- 9. Question: order_id

CREATE TABLE Product_Orders (
 order_id INT NOT NULL AUTO_INCREMENT,
 product_name VARCHAR(255) NOT NULL,
 total_revenue DOUBLE
);