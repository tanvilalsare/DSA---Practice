SELECT ROUND(
    COUNT(a2.player_id)/COUNT(a1.player_id)-- count will remove numm so the a2 i.e the player login again next day and a1 is total number of player by there first login 
 , 2) AS fraction
 FROM (
    SELECT player_id , MIN(event_date) AS first_login-- first login date for each player
    FROM Activity 
    GROUP BY player_id
 ) a1 -- calculate the no. of rows in a1 total 
 LEFT JOIN Activity a2 
      ON a1.player_id = a2.player_id
      AND DATEDIFF(a2.event_date, a1.first_login) = 1 -- have have row for each player may have null 
;