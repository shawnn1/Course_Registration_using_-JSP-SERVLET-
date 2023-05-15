<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page session="true" %>
    
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>adminhome</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  </head>
  <body>
  
        <div class="container-fluid">
        <% String username=(String)session.getAttribute("username"); %>
        <h1>welcome to <%=username %></h1>
      <div class="d-flex justify-content-center align-items-center min-vh-100">
      <div>
        <a href="registeredcourse.jsp?username=<%= username %>" class="btn btn-primary btn-large"> Registered Courses</a>
        <br>
        <a href="Allcourses.jsp" class="btn btn-secondary btn-large">ALL COURSES</a>
      </div>
      </div>
     
    </div>
    <footer>
    <nav class="bg-body-tertiary bg-primary">
    <div >
     <a class="btn btn-primary float-end" href="index.jsp">LOG OUT</a>
    </div>
    </nav>
    
    </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  </body>
</html>