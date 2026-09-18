# Write your MySQL query statement below
SELECT  
      'Low Salary' AS category ,-- take the literal string 'Low Salary' and put it in a column named category for this row
      SUM(CASE WHEN income < '20000' THEN 1 ELSE 0 END) AS accounts_count
FROM Accounts
UNION ALL 
SELECT
      'Average Salary' AS category ,
      SUM(CASE WHEN income BETWEEN '20000' AND '50000' THEN 1 ELSE 0 END) AS accounts_count
FROM Accounts
UNION ALL 
SELECT 
      'High Salary' AS category ,
      SUM(CASE WHEN income > '50000' THEN 1 ELSE 0 END) AS account_count
FROM Accounts;