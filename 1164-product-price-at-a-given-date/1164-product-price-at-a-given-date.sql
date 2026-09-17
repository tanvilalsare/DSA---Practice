# Write your MySQL query statement below
SELECT p.product_id, IFNULL(latest.new_price , 10) AS price -- we can take refrence of join statement in the select
FROM (SELECT DISTINCT product_id FROM Products) AS p
LEFT JOIN (
    SELECT product_id , new_price 
    FROM Products
    WHERE (product_id , change_date) IN (
        SELECT product_id , MAX(change_date) -- the newest date not all 
        FROM Products 
        WHERE change_date <= '2019-08-16'
        GROUP BY product_id 
    )
) latest
ON p.product_id = latest.product_id 