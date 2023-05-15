package com.course_registration.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.course_registration.model.Course_teacher;
import com.course_registration.dao.Addcourse_dao;

@WebServlet("/addcourse")
public class Addcourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String course_name=request.getParameter("course_name");
	 String teacher_name=request.getParameter("teacher_name");
	 String teacher_email=request.getParameter("teacher_email");
	 Course_teacher ct=new Course_teacher();
	 ct.setCourse_name(course_name);
	 
	 ct.setTeacher_name(teacher_name);
	 ct.setTeacher_email(teacher_email);
	 try {
		 Addcourse_dao addcourse=new Addcourse_dao();
		addcourse.registercourse(ct);
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 response.sendRedirect("./views/adminhome.jsp");
	 
	}

}
