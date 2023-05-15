CREATE TABLE MEAL (
  NAME VARCHAR(255),
  PRICE DOUBLE,
  CALORIES INT
);
INSERT INTO MEAL(NAME, PRICE, CALORIES)
VALUES ('Spaghetti Bolognese', 12.99, 600),
('Grilled Chicken Sandwich', 8.99, 400),
('Pesto Pasta', 10.99, 550),
('Steak and Mash', 19.99, 800),
('Sushi Platter', 15.99, 700);

CREATE TABLE MEAL_ORDER (
TIME_MEAL_ORDERED TIMESTAMP DEFAULT NOW(),
MEAL_NAME VARCHAR(255));

INSERT INTO MEAL_ORDER (TIME_MEAL_ORDERED, MEAL_NAME)
VALUES (NOW(), 'Spaghetti Bolognese');

INSERT INTO MEAL_ORDER (TIME_MEAL_ORDERED, MEAL_NAME)
VALUES (DATE_ADD(NOW(), INTERVAL 1 HOUR), 'Grilled Chicken Sandwich');

INSERT INTO MEAL_ORDER (TIME_MEAL_ORDERED, MEAL_NAME)
VALUES (DATE_ADD(NOW(), INTERVAL 2 HOUR), 'Pesto Pasta');

INSERT INTO MEAL_ORDER (TIME_MEAL_ORDERED, MEAL_NAME)
VALUES (DATE_ADD(NOW(), INTERVAL 3 HOUR), 'Pesto Pasta');

INSERT INTO MEAL_ORDER (TIME_MEAL_ORDERED, MEAL_NAME)
VALUES (DATE_ADD(NOW(), INTERVAL 4 HOUR), 'Grilled Chicken Sandwich');

INSERT INTO MEAL_ORDER (TIME_MEAL_ORDERED, MEAL_NAME)
VALUES (DATE_ADD(NOW(), INTERVAL 5 HOUR), 'Pesto Pasta');

INSERT INTO MEAL_ORDER (TIME_MEAL_ORDERED, MEAL_NAME)
VALUES (DATE_ADD(NOW(), INTERVAL 6 HOUR), 'Spaghetti Bolognese');

INSERT INTO MEAL_ORDER (TIME_MEAL_ORDERED, MEAL_NAME)
VALUES (DATE_ADD(NOW(), INTERVAL 7 HOUR), 'Pesta Pasta');

INSERT INTO MEAL_ORDER (TIME_MEAL_ORDERED, MEAL_NAME)
VALUES (DATE_ADD(NOW(), INTERVAL 8 HOUR), 'Pesto Pasta');

INSERT INTO MEAL_ORDER (TIME_MEAL_ORDERED, MEAL_NAME)
VALUES (DATE_ADD(NOW(), INTERVAL 9 HOUR), 'Spaghetti Bolognese');

-- Using a SELECT statement with a GROUP BY clause and COUNT function, retrieve the number of orders for each meal.
-- Using a SELECT statement with a WHERE clause and SUM function, retrieve the total revenue for all meals that have a price greater than €15.
-- Using a SELECT statement with a GROUP BY clause and COUNT function, retrieve the number of meals that have more than 500 calories.
-- Using a SELECT statement with a WHERE clause and SUM function, retrieve the total price for all meals that have a name containing the letter 'S'.
-- You can find items that start with the letter s with the following where clause
-- WHERE LOWER(NAME) LIKE '%s%';
-- Using a SELECT statement with a WHERE clause, GROUP BY clause, and COUNT function, retrieve the number of orders for each meal that were ordered before '202X-XX-XX 18:00:00' (Replace the Xs with your current date)

SELECT MEAL_NAME, COUNT(*) AS ORDER_COUNT
FROM MEAL_ORDER
GROUP BY MEAL_NAME;

SELECT SUM(PRICE) AS TOTAL_REVENUE
FROM MEAL
WHERE PRICE > 15;

SELECT COUNT(*) AS MEAL_COUNT
FROM MEAL
WHERE CALORIES > 500;

SELECT SUM(PRICE) AS TOTAL_PRICE
FROM MEAL
WHERE LOWER(NAME) LIKE '%s%';

SELECT MEAL_NAME, COUNT(*) AS ORDER_COUNT
FROM MEAL_ORDER
WHERE TIME_MEAL_ORDERED < '2023-05-14 20:00:00'
GROUP BY MEAL_NAME;



