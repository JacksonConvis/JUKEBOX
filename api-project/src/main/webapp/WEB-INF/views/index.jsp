<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Search</title>
  </head>
  <body>
    <h1>Music Streaming API</h1>
    <form method="post" action="/searchresults">
      <input
        type="text"
        name="searchTerm"
        placeholder="What do you want to hear?"
        required
      />
      <input type="submit" />
    </form>
    <br />
    <button onclick="location.href='/favorites'" type="button">
      Your Favorites
    </button>
  </body>
</html>
