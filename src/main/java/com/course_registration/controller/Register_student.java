package com.course_registration.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.course_registration.model.Student_course;
import com.course_registration.dao.Student_register_dao;

/**
 * Servlet implementation class Register_student
 */
@WebServlet("/Register_student")
public class Register_student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String course_name=request.getParameter("course_name");
		String teacher_name=request.getParameter("teacher_name");
		String student_name=request.getParameter("student_name");
		String student_email=request.getParameter("student_email");
		Student_course sc=new Student_course();
		sc.setCourse_name(course_name);
		sc.setTeacher_name(teacher_name);
		sc.setStudent_name(student_name);
		sc.setStudent_email(student_email);
		try {
			Student_register_dao ob=new Student_register_dao();
			ob.registestudent(sc);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
