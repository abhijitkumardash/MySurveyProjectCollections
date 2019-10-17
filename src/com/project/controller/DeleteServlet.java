package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dto.UserMaster;
import com.project.service.DeleteProfileService;


@WebServlet("/delete")
public class DeleteServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		int userId = Integer.parseInt(req.getParameter("userId"));

		UserMaster um = new UserMaster();
		um.setUserId(userId);

		DeleteProfileService ds = new DeleteProfileService();

		boolean b = ds.deleteProfile(userId);

		if(b)
		{
			out.print("<h1>"+"Successfully Deleted"+"</h1>");
			resp.sendRedirect("./Surveyor.html");
		}
		else
		{
			out.print("<h1>"+"Failed to Deleted"+"</h1>");
			resp.sendRedirect("./deleteProfile.html");
		}
	}

}
