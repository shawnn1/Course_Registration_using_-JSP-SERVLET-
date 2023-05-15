package com.course_registration.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.*;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String role=request.getParameter("role");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String url="jdbc:mysql://localhost:3306/m_database";
		 String uname="shawn";
		 String pass="shawn";
		 String query="insert into "+role+"(username,password) values(?,?)";
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection(url,uname,pass);
			 PreparedStatement ps=con.prepareStatement(query);
			 ps.setString(1, username);
			 ps.setString(2, password);
			
			 int status=ps.executeUpdate();
			 if(status>0)
			 {
			
				

				 // set the content type to HTML
				 response.setContentType("text/html");

				 // write a JavaScript code to display the message as an alert box
				 PrintWriter out = response.getWriter();
				 out.println("<script>alert('Successfully Registered');</script>");
				 response.sendRedirect("./views/index.jsp");
				

			 }
			
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		
	}

}
