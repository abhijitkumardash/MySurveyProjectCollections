package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dto.UserMaster;
import com.project.service.LoginService;

@WebServlet("/loginnn")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		int userid = Integer.parseInt(req.getParameter("userid"));
		String password = req.getParameter("password");
		String role=req.getParameter("role");

		UserMaster um = new UserMaster();
		um.setUserId(userid);
		um.setPassword(password);
		um.setUserType(role);

		LoginService ls = new LoginService();

		UserMaster us = ls.login(userid, password);
		

		if(us!=null)
		{
			System.out.println("Entrance1");
			if(us.getUserType().equals("Admin"))
			{
				System.out.println("Entrance2");
				out.print("<h1>"+"Successfully Admin Login"+"</h1>");
			}
			if(us.getUserType().equals("Surveyor"))
			{
				out.print("<h1>"+"Successfully Surveyor Login page"+"</h1>");
				resp.sendRedirect("./Surveyor.html");
			}
			if(us.getUserType().equals("Respondent"))
			{
				System.out.println("Entrance 3");
				//out.print("<h1>"+"Successfully Response Login page"+"</h1>");
				resp.sendRedirect("./User.html");
			}
		}
		else
		{
			out.print("<h1>"+"Failed to Login"+"</h1>");
			resp.sendRedirect("./LoginPage.html");
		}

	}


}
