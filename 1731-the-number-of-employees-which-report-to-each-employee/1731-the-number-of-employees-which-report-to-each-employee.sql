# Write your MySQL query statement below
SELECT e1.employee_id ,
       e1.name,
       COUNT(e2.employee_id) AS reports_count ,
       ROUND(AVG(e2.age) , 0) AS average_age -- rounding off to the nearet integer 
FROM Employees e1
JOIN Employees e2 
     ON e1.employee_id = e2.reports_to 
GROUP BY e1.employee_id , e1.name -- we group by manager's indentity 
ORDER BY e1.employee_id;