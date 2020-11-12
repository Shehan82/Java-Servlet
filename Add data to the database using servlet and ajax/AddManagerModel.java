package com.my;
import java.sql.*;
public class AddManagerModel {
	
	public void addManager(ManagerDetails manager) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/salon","root","");
		String query = "insert into managers values (?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, manager.getEmpId());
		pst.setString(2, manager.getName());
		pst.setInt(3, manager.getContactNumber());
		pst.setString(4, manager.getNic());
		
		pst.executeUpdate();
	}
	

}
