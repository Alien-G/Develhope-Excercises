CREATE TABLE MEAL (
  NAME VARCHAR(255),
  PRICE DOUBLE,
  CALORIES INT
);

CREATE TABLE INGREDIENT (
  NAME VARCHAR(255),
  CONTAINS_LACTOSE BOOLEAN,
  VEGETARIAN BOOLEAN,
  VEGAN BOOLEAN,
  GLUTEN_FREE BOOLEAN
);

INSERT INTO INGREDIENT (NAME, CONTAINS_LACTOSE, VEGETARIAN, VEGAN, GLUTEN_FREE)
VALUES ('Eggs', false, true, false, true);

INSERT INTO INGREDIENT (NAME, CONTAINS_LACTOSE, VEGETARIAN, VEGAN, GLUTEN_FREE)
VALUES ('Bread', false, true, true, false);

INSERT INTO INGREDIENT (NAME, CONTAINS_LACTOSE, VEGETARIAN, VEGAN, GLUTEN_FREE)
VALUES ('Beef Patty', false, false, false, true);

INSERT INTO INGREDIENT (NAME, CONTAINS_LACTOSE, VEGETARIAN, VEGAN, GLUTEN_FREE)
VALUES ('Lettuce', false, true, true, true);

INSERT INTO INGREDIENT (NAME, CONTAINS_LACTOSE, VEGETARIAN, VEGAN, GLUTEN_FREE)
VALUES ('Yoghurt', true, true, false, true);

INSERT INTO MEAL(NAME, PRICE, CALORIES)
VALUES ('Spaghetti Bolognese', 12.99, 600),
('Grilled Chicken Sandwich', 8.99, 400),
('Pesto Pasta', 10.99, 550),
('Steak and Mash', 19.99, 800),
('Sushi Platter', 15.99, 700);

SELECT * FROM  MEAL
WHERE PRICE < 15;
SELECT * FROM  INGREDIENT
WHERE VEGETARIAN ;
SELECT * FROM  MEAL
WHERE CALORIES > 500;
SELECT * FROM  MEAL
WHERE PRICE >= 15 AND PRICE <= 16;
SELECT * FROM  INGREDIENT
WHERE CONTAINS_LACTOSE = 0 AND GLUTEN_FREE = 1;
SELECT * FROM  MEAL
WHERE PRICE < 15 OR CALORIES >=600;
SELECT * FROM  INGREDIENT
WHERE VEGAN = 1 OR GLUTEN_FREE = 1;
SELECT * FROM  MEAL
WHERE NAME= 'Pesto Pasta';
SELECT * FROM  INGREDIENT
WHERE CONTAINS_LACTOSE = 1;
SELECT * FROM  MEAL
WHERE PRICE > 20 AND CALORIES < 800;