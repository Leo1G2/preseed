SELECT  
    Name,
    Milliseconds
FROM    
    tracks
WHERE
    Composer = 'AC/DC'
ORDER BY 
    Milliseconds ASC;