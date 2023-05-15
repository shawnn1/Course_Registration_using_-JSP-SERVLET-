<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> 
<%@page import="javax.servlet.http.HttpServletRequest" %>  
<%@ page import="javax.servlet.http.HttpSession" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
 
</head>
<body>
<%String url="jdbc:mysql://localhost:3306/m_database";
String uname="shawn";
String pass="shawn";
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
}
catch(ClassNotFoundException e){
	e.printStackTrace();
}

%>
<h1>Learning Courses</h1>
<table class="table table-hover">
<tr>
<td>Course Name</td>

</tr>
<%
String username=(String)session.getAttribute("username");

try{
	Connection con=DriverManager.getConnection(url,uname,pass);
	
	String query="select course from course_teacher where teacher_name=?";
	PreparedStatement st=con.prepareStatement(query);
	st.setString(1,username);
	ResultSet rs=st.executeQuery();
	while(rs.next())
	{%>
	<% String course=rs.getString("course");
	String q="select COUNT(*) from course_student where course_name=?";
	PreparedStatement pst=con.prepareStatement(q);
	pst.setString(1,course);
	ResultSet rst=pst.executeQuery();
	rst.next();
	
	int  count=rst.getInt(1);
	   %>
	<tr>
	<td><%=course %></td>
		<td> <a href="registeredstudent.jsp?course=<%= course %>" class="btn btn-primary">Total(<%=count %>)</a></td>
	
	
	
	
	
	</tr>
	
	<%}
}
catch(Exception e){
	e.printStackTrace();
}
%>
</table>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  
</body>
</html>