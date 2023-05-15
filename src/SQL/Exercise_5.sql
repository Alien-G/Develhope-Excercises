-- 1. Use all of the functions below, find out what they do, write a description for them here or in the comments of the code. Add a meaningful column alias

CONCAT(COLUMN1, COLUMN2) AS CONCAT_COLUMN,                          -- Combines the columns into a single one named concat_column
LOWER(COLUMN) AS LOWER_COLUMN,                                      -- Converts column to lowercase and assigns it an alias lower_column
UPPER(COLUMN) AS UPPER_COLUMN,                                      -- Converts column to uppercase and assigns it an alias upper_column
TRIM(COLUMN) AS TRIMMED_COLUMN,                                     -- Removes leading/trailing spaces from column and assigns it an alias trimmed_column
LENGTH(COLUMN) AS COLUMN_LENGTH,                                    -- Calculates the length of column and assigns it an alias column_length
SUBSTRING(COLUMN, START, LENGTH) AS SUBSTRING_COLUMN,               -- Extracts a substring from column and assigns it an alias substring_column
ROUND(COLUMN, DECIMAL_PLACES) AS ROUNDED_VALUE,                     -- Rounds the value in column to decimal_places and assigns it an alias rounded_value
DATE_ADD(COLUMN, INTERVAL EXPRESSION UNIT) AS DATE_ADDED,           -- Adds an interval to column and assigns it an alias date_added
DATE_SUB(COLUMN, INTERVAL EXPRESSION UNIT) AS DATE_SUBTRACTED,      -- Subtracts an interval from column and assigns it an alias date_subtracted
FORMAT(COLUMN, FORMAT_STRING) AS FORMATTED_VALUE                    -- Formats the value in column according to format_string and assigns it an alias formatted_value


-- 2. Using DATE_ADD or DATE_SUB and the following SQL SELECT NOW(); Select your birthday by passing the result into the next item
-- i.e. DATE_ADD(DATE_ADD(NOW(), INTERVAL 7 DAY), INTERVAL 2 MONTH) as BIRTHDAY_DATE
-- If you're feeling really adventurous try to get the time to exactly midnight!

SELECT DATE_ADD(DATE_ADD(DATE(NOW()), INTERVAL 2 MONTH), INTERVAL 11 DAY) AS BIRTHDAY_DATE;
SELECT CONCAT(SUBSTRING(NOW(), 1, 11), '00:00:00') AS MIDNIGHT;