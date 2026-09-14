# Write your MySQL query statement below
SELECT MAX(num) AS num -- getting the largest number out of all the numbers 
FROM (
    SELECT num 
    FROM MyNumbers
    GROUP BY num -- creating bucket of same number 
    HAVING COUNT(num) = 1 -- bucket only with 1 ele in row will survive 
) AS SingleValNumber -- in output only the num with single val and max output will be shown 