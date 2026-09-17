# Write your MySQL query statement below
SELECT person_name 
FROM (
    SELECT person_name, 
           turn, 
           SUM(weight) OVER (ORDER BY turn) AS running_sum
    FROM Queue
) t
WHERE running_sum <=1000
ORDER BY turn DESC -- sorts those remaining rows by turn descending, then grabs the top one — i.e., the person with the highest turn value among everyone who still fit.
LIMIT 1;