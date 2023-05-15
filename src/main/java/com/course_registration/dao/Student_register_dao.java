package com.course_registration.dao;
import com.course_registration.model.*;
import java.sql.*;

public class Student_register_dao {
	public void registestudent(Student_course ct) throws ClassNotFoundException{
		 String url="jdbc:mysql://localhost:3306/m_database";
		 String uname="shawn";
		 String pass="shawn";
		 PreparedStatement psmt=null;
		 String query="insert into course_student(course_name,teacher_name,student_name,student_email)"+"values(?,?,?,?)";
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection( url,uname,pass);
			 psmt=con.prepareStatement(query);
			 psmt.setString(1, ct.getCourse_name());
			 psmt.setString(2, ct.getTeacher_name());
			 psmt.setString(3, ct.getStudent_name());
			 psmt.setString(4, ct.getStudent_email());
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
