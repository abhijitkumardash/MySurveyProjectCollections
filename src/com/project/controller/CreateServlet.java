package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dto.UserMaster;
import com.project.service.CreateService;

@WebServlet("/create")
public class CreateServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		int userId = Integer.parseInt(req.getParameter("userid"));
		String password = req.getParameter("password");
		String firstName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");
		String userType = req.getParameter("usertype");
		
		UserMaster um = new UserMaster();
		um.setUserId(userId);
		um.setPassword(password);
		um.setFirstName(firstName);
		um.setLastName(lastName);
		um.setUserType(userType);
		
		CreateService cs = new CreateService();
		
		boolean b = cs.createProfile(um);
		
		if(b)
		{
			
			out.print("<h1>"+"Successfully created"+"</h1>");
			resp.sendRedirect("./LoginPage.html");
		}
		else
		{
			out.print("<h1>"+"Failed to created"+"</h1>");
			resp.sendRedirect("./create.html");
		}
		
		
	}
	
}
