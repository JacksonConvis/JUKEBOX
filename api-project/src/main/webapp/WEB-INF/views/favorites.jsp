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
    <h1>My Favorites</h1>
    <button onclick="location.href='/'" type="button">Back to Search</button>
    
 
    
    <table>
      <tbody>
      <c:forEach var="fav" items="${favorites}">
      <form action="/remove" method="post">
        <tr>
        <input type="hidden"  name="id" value="${fav.id}">
          <td><img src="${fav.album.cover}" /></td>
          <td>
            Artist Name: <c:out value="${fav.artist.name}" /> <br />
           Song Title:  <c:out value="${fav.title}" /><br />
            Song Duration: <c:out value="${fav.duration}" /><br />
            Album Title: <c:out value="${fav.album.title}" /><br />
            <audio controls>
              <source src="${fav.preview}" />
            </audio>
            <input type="submit" value="Remove from Favorites"><br><br>
          </td>
          
        </tr>
        </form>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
