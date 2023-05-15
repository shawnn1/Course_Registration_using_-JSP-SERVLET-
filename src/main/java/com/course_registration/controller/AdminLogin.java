package com.course_registration.controller;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String url="jdbc:mysql://localhost:3306/m_database";
		 String uname="shawn";
		 String pass="shawn";
		 String query="select username from admin where username=? and password=?";
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection(url,uname,pass);
			 PreparedStatement ps=con.prepareStatement(query);
			 ps.setString(1, username);
			 ps.setString(2, password);
			 ResultSet rs=ps.executeQuery();
			 if(rs.next())
			 {
				  HttpSession session=request.getSession();
				  session.setAttribute(username, username);
				  session.setAttribute(password, password);				
				  response.sendRedirect("./views/adminhome.jsp");
			 } 
			 else {
				  response.sendRedirect("./views/login.jsp");
			 }
			
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
