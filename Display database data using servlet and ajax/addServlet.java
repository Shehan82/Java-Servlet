package com.my;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;






public class addServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException
	{
		
		try 
		{
			ManagerModel manager = new ManagerModel();
		ArrayList<ManagerDetails> managerDetails =	manager.getManagersDetails();
////			
			String json = new Gson().toJson(managerDetails);
			res.setContentType("application/json");
	        res.setCharacterEncoding("UTF-8");
			res.getWriter().write(json);
			
	         
			
			
		} 
		
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
		
		
		
		 
	}
	
	
	
	
	
}
