<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
	<table>
		<tbody>
			<tr>
				<c:forEach var="song" items="${songs.data }">
				<td><img src="${song.album.cover_big}"></td>
				<td>
				${song.artist.name }<br>
				${song.title }<br>
				${song.duration }<br>
				${song.album.title }
				</td>
				<td><button onclick="" type="button">Add to Favorites</button></td>
				</c:forEach>
			</tr>
		</tbody>
	</table>
</body>
</html>