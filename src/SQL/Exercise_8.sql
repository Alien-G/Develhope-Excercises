CREATE TABLE INGREDIENT (
  NAME VARCHAR(255),
  CONTAINS_LACTOSE BOOLEAN,
  VEGETARIAN BOOLEAN,
  VEGAN BOOLEAN,
  GLUTEN_FREE BOOLEAN
);

-- Add constraints to every column of the INGREDIENTS table, you should use NOT NULL for some columns and unique for other(s)

ALTER TABLE INGREDIENT
MODIFY COLUMN NAME VARCHAR(255) NOT NULL;

ALTER TABLE INGREDIENT
ADD CONSTRAINT UC_NAME UNIQUE (NAME);

ALTER TABLE INGREDIENT
MODIFY COLUMN CONTAINS_LACTOSE BOOLEAN NOT NULL;

ALTER TABLE INGREDIENT
MODIFY COLUMN VEGETARIAN BOOLEAN NOT NULL;

ALTER TABLE INGREDIENT
MODIFY COLUMN VEGAN BOOLEAN NOT NULL;

ALTER TABLE INGREDIENT
MODIFY COLUMN GLUTEN_FREE BOOLEAN NOT NULL;
