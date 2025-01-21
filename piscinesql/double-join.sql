SELECT DISTINCT tracks.Name AS TrackName, playlists.Name AS PlaylistName
FROM playlist_track
JOIN tracks ON playlist_track.TrackId = tracks.TrackId
JOIN playlists ON playlist_track.PlaylistId = playlists.PlaylistId
WHERE playlists.Name = 'TV Shows'
LIMIT 100;
