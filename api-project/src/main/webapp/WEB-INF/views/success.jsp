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
    <h1>Added to Favorites</h1>
    <button onclick="location.href='/favorites'" type="button">
      Show My Favorites
    </button>
    <button onclick="location.href='/'" type="button">Back to Search</button>
    <table>
      <tbody>
        <tr>
          <td><img src="${song.album.cover}" /></td>
          <td>
            <c:out value="${song.artist.name}" /> <br />
            <c:out value="${song.title}" /><br />
            <c:out value="${song.duration}" /> sec<br />
            <c:out value="${song.album.title}" /><br />
            <audio controls>
              <source src="${song.preview}" />
            </audio>
          </td>
        </tr>
      </tbody>
    </table>
  </body>
</html>
