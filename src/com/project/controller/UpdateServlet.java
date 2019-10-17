package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dto.UserMaster;
import com.project.service.UpdateService;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String firstName = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String password = req.getParameter("password");
		int userId = Integer.parseInt(req.getParameter("userid"));

		UserMaster um = new UserMaster();
		um.setFirstName(firstName);
		um.setLastName(lastname);
		um.setPassword(password);
		um.setUserId(userId);
		
		UpdateService us = new UpdateService();

		boolean b = us.update(um);

		if(b)
		{
			out.print("<h1>"+"Successfully Updated"+"</h1>");
		}
		else
		{
			out.print("<h1>"+"Failed to Updated"+"</h1>");
		}
	}

}
