# Write your MySQL query statement below
SELECT r.contest_id,
       ROUND(
        COUNT(r.user_id)*100/(SELECT COUNT(*) FROM Users) -- a subquery that runs once and gives you the total number of registered users overall.
       , 2) AS percentage
FROM Register r
GROUP BY r.contest_id
ORDER BY percentage DESC, r.contest_id ASC;