package com.my;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddManagerServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int empId = Integer.parseInt(req.getParameter("empId"));
		String name = req.getParameter("name");
		int cNum = Integer.parseInt(req.getParameter("cNum"));
		String nic = req.getParameter("nic");
		
		
		
		ManagerDetails Manager = new ManagerDetails(empId,name,cNum,nic);
		
		AddManagerModel model = new AddManagerModel();
		
		try {
			model.addManager(Manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res.getWriter().write(name);
	}

}
