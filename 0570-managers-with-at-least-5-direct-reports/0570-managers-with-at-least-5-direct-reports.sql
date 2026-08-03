# Write your MySQL query statement below
SELECT e1.name
FROM Employee e1
LEFT JOIN Employee e2
   ON e1.id = e2.managerId -- e1:the employe e2: whom the employee report too 
GROUP BY e1.id , e1.name
HAVING COUNT(e2.id)>=5; -- managers who have 5 or more direct reports.