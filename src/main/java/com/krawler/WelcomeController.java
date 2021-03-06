package com.krawler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.krawler.student.dao.StudentDAO;
import com.krawler.student.dao.StudentDAOImpl;

/**
 * Servlet implementation class WelcomeController
 */
public class WelcomeController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();

			String uname = request.getParameter("username");
			String pass = request.getParameter("password");
			RequestDispatcher rd;
			HttpSession session = request.getSession();

			StudentDAO stobj = new StudentDAOImpl();

			Student student = stobj.getStudent(uname);


			session.setAttribute("user", student);
			
			if (student != null && uname.equals(student.getUname())) {
				session.setAttribute("ssid", 1234);
				rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			} else {
				rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
