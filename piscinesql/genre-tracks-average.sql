SELECT 
    genres.Name AS Name,
    AVG(tracks.Milliseconds) AS AverageDuration
FROM
    genres
JOIN 
    tracks ON genres.GenreId = tracks.GenreId
GROUP BY 
    genres.GenreId
ORDER BY 
    AverageDuration DESC;