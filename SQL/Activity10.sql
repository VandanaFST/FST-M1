REM   Script: Activity10
REM   Activity10 SQL

SELECT * FROM ORDERS WHERE SALESMAN_ID = (SELECT SALESMAN_ID FROM CUSTOMERS WHERE CUSTOMER_ID=3007);

SELECT * FROM ORDERS WHERE SALESMAN_ID IN (SELECT SALESMAN_ID FROM SALESMAN WHERE SALESMAN_CITY='New York');

SELECT GRADE,COUNT(*) AS COUNT FROM CUSTOMERS C GROUP BY GRADE 
HAVING C.GRADE > (SELECT AVG(GRADE) FROM CUSTOMERS WHERE CITY='New York');

SELECT COUNT(*) AS COUNT FROM CUSTOMERS C WHERE C.GRADE > (SELECT AVG(GRADE) FROM CUSTOMERS WHERE CITY='New York');

SELECT * FROM ORDERS WHERE SALESMAN_ID IN (SELECT SALESMAN_ID FROM SALESMAN WHERE COMMISSION = (SELECT MAX(COMMISSION) FROM SALESMAN));
