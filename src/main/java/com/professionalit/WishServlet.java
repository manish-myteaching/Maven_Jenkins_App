package com.professionalit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/wish")
public class WishServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public WishServlet() {
		System.out.println("WishServlet");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(new Date().getSeconds());
		PrintWriter pw=response.getWriter();
	      pw.println("<html>");
	      pw.println("<marquee><h1>Welcome to FlipKart<h1></marquee>");
	      pw.println("<h>Welcome Manish<h>");
	      Calendar calendar = Calendar.getInstance();
			int hours = calendar.get(calendar.HOUR_OF_DAY);
			if (hours < 12) {
				pw.println("<h1>Good Morning <h1> " + request.getParameter("uname"));
			} else if (hours > 12 && hours < 16) {
				pw.println("<h1>Good After Noon <h1> " + request.getParameter("uname"));
			} else if (hours > 16 && hours < 20) {
				pw.println("<h1>Good Evening <h1> " + request.getParameter("uname")) ;
			} else {
				pw.println("<h1>Good Night <h1>" + request.getParameter("uname"));
		}
	       pw.println("</html>");
	      pw.close();


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
