# Write your MySQL query statement below
SELECT name, bonus
FROM Employee e 
LEFT JOIN Bonus b /*LEFT JOIN keeps every row from the left table (Employee), whether or not it finds a match in the right table (Bonus). Where there's no match, the columns from the right table just come back as NULL instead of the row disappearing.*/
     ON e.empId = b.empId
WHERE b.bonus < 1000 OR b.bonus IS NULL;
      