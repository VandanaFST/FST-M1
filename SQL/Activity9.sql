REM   Script: Activity9
REM   Activity9 SQL

SELECT C.CUSTOMER_NAME,S.SALESMAN_NAME FROM CUSTOMERS C INNER JOIN  SALESMAN S 
ON C.SALESMAN_ID = S.SALESMAN_ID;

SELECT C.CUSTOMER_ID, C.CUSTOMER_NAME, C.GRADE,S.SALESMAN_NAME FROM CUSTOMERS C
LEFT JOIN SALESMAN S ON C.SALESMAN_ID = S.SALESMAN_ID
WHERE C.GRADE<300 ORDER BY C.GRADE;

SELECT C.CUSTOMER_ID,C.CUSTOMER_NAME,S.SALESMAN_NAME,S.COMMISSION FROM CUSTOMERS C 
INNER JOIN  SALESMAN S ON C.SALESMAN_ID = S.SALESMAN_ID
WHERE S.COMMISSION>12;


SELECT OD.ORDER_NO, OD.ORDER_DATE, OD.PURCHASE_AMOUNT,C.CUSTOMER_NAME,S.SALESMAN_NAME,S.COMMISSION FROM ORDERS OD
LEFT JOIN CUSTOMERS C ON OD.CUSTOMER_ID= C.CUSTOMER_ID
INNER JOIN SALESMAN S ON C.SALESMAN_ID = S.SALESMAN_ID;