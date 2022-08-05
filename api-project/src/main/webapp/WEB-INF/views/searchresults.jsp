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
    <h1>Your Search Results</h1>
    <button onclick="location.href='/favorites'" type="button">Show My Favorites</button>
    <button onclick="location.href='/'" type="button">Back to Search</button>
    <table>
      <th></th>
      <th style="text-align: center; vertical-align: middle;">Details</th>
      <th style="text-align: center; vertical-align: middle;">Preview</th>
      <th style="text-align: center; vertical-align: middle;"></th>
      <th style="text-align: center; vertical-align: middle;">Liked</th>
      <tbody>
        <c:forEach var="song" items="${songs}">
          <form action="/addfavorite" method="post">
          <tr>
          <input type="hidden"  name="id" value="${song.id}">
          <input type="hidden"  name="cover" value="${song.album.cover}">
          <td><img src="${song.album.cover}"></td>
          <td style="text-align: center; vertical-align: middle;"> 
          <input type="hidden"  name="name" value="${song.artist.name}">
          <c:out value = "${song.artist.name}"/> <br>
          <input type="hidden"  name="title" value="${song.title}">
          <c:out value = "${song.title}"/><br>
          <input type="hidden"  name="duration" value="${song.duration}">
          <c:out value = "${song.duration}"/> <br>
          <input type="hidden"  name="albumTitle" value="${song.album.title}">
          <c:out value = "${song.album.title}"/><br>
          </td>
          <td>
          <audio controls>
            <input type="hidden"  name="preview" value="${song.preview}">
            <source src="${song.preview}" />
          </audio>
          </td>
          <td>
          <input type="submit" value="Add to Favorites">
          </td>
          <td style="text-align: center; vertical-align: middle;">
            <c:forEach var="liked" items="${liked }" >
           <c:if test="${song.id== liked.id}">
          <h2>&#127775;</h2>
          </c:if>
          </c:forEach>
          </td>
          </tr>
        </form>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>