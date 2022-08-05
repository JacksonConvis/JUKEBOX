<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Results</title>
    <link rel="stylesheet" href="/style.css" />
  </head>
  <body>
    <h1 style="text-align: center; vertical-align: middle;">My Favorites</h1>
    <div style="text-align: center; vertical-align: middle;">
    <button class="btn btn-primary btn-lg" class="btn btn-primary btn-lg" onclick="location.href='/'" type="button">Back to Search</button>
    </div>
    <br>
    <div class="row" style="text-align: center; vertical-align: middle;">
			
			<div class="center">
				<form class="form" action="searchBy" method="post">
					<label for="searchTerm">Search You Favs</label> 
					<input type="text" name="searchTerm" placeholder="Search By Song" /> 
						<input type="submit" class="button" />
				</form>
			</div>
		</div>
    
    <table class="center">
      <tbody>
      <c:forEach var="fav" items="${favorites}">
      <form action="/remove" method="post">
        <tr>
        <input type="hidden"  name="id" value="${fav.id}">
          <td><img src="${fav.album.cover}" /></td>
          <td style="text-align: center; vertical-align: middle;">
            <c:out value="${fav.artist.name}" /> <br />
            <c:out value="${fav.title}" /><br />
            <c:out value="${fav.duration}" /><br />
            <c:out value="${fav.album.title}" /><br />
            </td>
            <td>
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
