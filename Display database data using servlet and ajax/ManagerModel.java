package com.my;

import java.sql.*;
import java.util.ArrayList;

public class ManagerModel {
	
	private ArrayList<ManagerDetails> AllManagersDetails = new ArrayList<>();
	
	
	public ArrayList<ManagerDetails> getManagersDetails() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/salon","root","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from managers");
		
		while(rs.next())
		{
			AllManagersDetails.add(new ManagerDetails(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
			
		}
		return AllManagersDetails;
		
		
		
		
		
	}

}
