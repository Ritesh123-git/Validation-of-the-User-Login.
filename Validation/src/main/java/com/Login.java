package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogicController
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String username = request.getParameter("email");
		String password = request.getParameter("pass");
		RequestDispatcher rd = null;
		if(username.equals("abc@gmail.com") && password.equalsIgnoreCase("123") ) {
			rd = request.getRequestDispatcher("welcome.html");
			rd.forward(request,response);
		}
		else {
			rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
			out.println("<h4><center> <span style='color:red'>Invalid Credentials , Try Again!!!</span></center></h4>");
		}
	}

}
