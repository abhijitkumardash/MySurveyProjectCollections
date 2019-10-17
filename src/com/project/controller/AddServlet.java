package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dto.SurveyMaster;
import com.project.service.AddService;

@WebServlet("/add")
public class AddServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		int surveyid = Integer.parseInt(req.getParameter("surveyid"));
		String title = req.getParameter("title");
		String desc = req.getParameter("desc");
		int userid = Integer.parseInt(req.getParameter("userid"));

		SurveyMaster sm = new SurveyMaster();
		sm.setSurveyId(surveyid);
		sm.setTitle(title);
		sm.setDescription(desc);
		sm.setUserId(userid);

		AddService as = new AddService();
		boolean b = as.addTitle(sm);

		if(b)
		{
			out.print("<h1>"+"Successfully Added"+"</h1>");
			resp.sendRedirect("./Surveyor.html");
		}
		else
		{
			out.print("<h1>"+"Failed to Added"+"</h1>");
			resp.sendRedirect("./AddTitle.html");
		}

	}

}
