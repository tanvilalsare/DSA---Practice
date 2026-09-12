SELECT ROUND(
    100*SUM(CASE WHEN order_date=customer_pref_delivery_date THEN 1 ELSE 0 END)/COUNT(*)
, 2) AS immediate_percentage # we have to find te percentage of immedate order 
FROM Delivery
WHERE (customer_id , order_date) IN (
    SELECT customer_id , MIN(order_date) #finding he least date i.e the first date of order 
    FROM Delivery 
    GROUP BY (customer_id) #find the percentage of immediate orders in the first orders of all customers,
);