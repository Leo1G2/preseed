SELECT 
    ar.Name AS ArtistName,
    al.Title AS AlbumName,
    t.Name AS TrackName,
    ROUND(t.Bytes / 1000000.0, 2) || ' MB' AS MegaBytes
FROM 
    tracks t
JOIN 
    albums al ON t.AlbumId = al.AlbumId
JOIN 
    artists ar ON al.ArtistId = ar.ArtistId
WHERE 
    al.Title = 'American Idiot'
ORDER BY 
    t.TrackId;
