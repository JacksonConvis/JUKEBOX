<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Results</title>
  </head>
  <body>
    <table>
      <tbody>
        <c:forEach var="song" items="${songs.data}">
  <form action="/addfavorite" method="post">
        <tr>
          <td><img src="${song.album.cover}"></td>
          <td>
          ${song.artist.name}<br>
          ${song.title}<br>
          <audio controls>
  		<source src="${song.preview}"/></audio><br>
          ${song.duration}<br>
          ${song.album.title}
          </td>
          <td>
    		<input type="submit" name="add" value="Add to Favorites" />
			
			</td>
        </tr>
    </form>
      </c:forEach>
      </tbody>
    </table>
  </body>
</html>
