<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Search</title>
    <link rel="stylesheet" href="/style.css" />
  </head>
  <body>
    <h1 style="text-align: center; vertical-align: middle;">Welcome to JukeBox</h1>
    <form method="post" action="/searchresults" style="text-align: center; vertical-align: middle;">
      <input class="form-control form-control-lg" type="search" placeholder="What do you want to hear?" id="inputLarge" name="searchTerm">
      <button class="btn btn-lg btn-danger" type="submit">Search</button>
    </form>
    <br />
    <div style="text-align: center; vertical-align: middle;">
    <button type="button" class="btn btn-primary btn-lg" onclick="location.href='/favorites'">
      Your Favorites
    </button>
    </div>
  </body>
</html>
