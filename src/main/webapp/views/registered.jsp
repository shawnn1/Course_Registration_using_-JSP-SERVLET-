<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="javax.servlet.http.HttpServletRequest" %> 
    <%@page import ="javax.servlet.http.HttpSession" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>adminlogin</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
    <div class="d-flex justify-content-center align-items-center min-vh-100">
    <div>
     <form action="<%= request.getContextPath() %>/Register_student" method="post">
      <div class="mb-3">
        <label class="form-label">Course Name:</label>
        <input class="form-control" type="text" name="course_name" id="coursename" value="<%= request.getParameter("course")%>">
        
        
      </div>
      <div class="mb-3">
        <label class="form-label">Course Teacher:</label>
        <input class="form-control" type="text" name="teacher_name" id="courseteacher" value="<%= request.getParameter("teacher_name")%>">
      </div>
      <div class="mb-3">
        <label class="form-label">Student Name:</label>
        <input class="form-control" type="text" name="student_name" id="studentname">
      </div>
      <div class="mb-3">
        <label class="form-label">Student Email:</label>
        <input class="form-control" type="email" name="student_email" id="studentemail">
      </div>
      <input type="submit" class="btn btn-secondary "  onclick="showAlert()" value="REGISTER">
     </form>
    </div>
    </div> 
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  </body>
</html>