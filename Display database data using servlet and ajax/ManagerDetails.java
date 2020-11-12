package com.my;

public class ManagerDetails {
	
	private int empId;
	private String name;
	private int contactNumber;
	private String nic;

	
	public ManagerDetails(int empId,String name,int contactNumber,String nic)
	{
		this.empId = empId;
		this.name = name;
		this.contactNumber = contactNumber;
		this.nic = nic;
	
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNic() {
		return nic;
	}


	public void setNic(String nic) {
		this.nic = nic;
	}
		
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	

}
