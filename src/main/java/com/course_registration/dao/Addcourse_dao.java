package com.course_registration.dao;
import com.course_registration.model.*;
import java.sql.*;

public class Addcourse_dao {
	public void registercourse(Course_teacher ct) throws ClassNotFoundException{
		 String url="jdbc:mysql://localhost:3306/m_database";
		 String uname="shawn";
		 String pass="shawn";
		 PreparedStatement psmt=null;
		 String query="insert into course_teacher(course,teacher_name,teacher_email)"+"values(?,?,?)";
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection( url,uname,pass);
			 psmt=con.prepareStatement(query);
			 psmt.setString(1, ct.getCourse_name());
			 psmt.setString(2, ct.getTeacher_name());
			 psmt.setString(3, ct.getTeacher_email());
			 int status=psmt.executeUpdate();
			 if(status>0)
			 {
				 System.out.println("registered");
			 }
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
	}

}
