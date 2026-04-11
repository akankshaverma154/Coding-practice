package com.dsa.list;

import java.util.Objects;

public class Employee {
	
	String firstName;
	String lstName;
	int id;
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lstName=" + lstName + ", id=" + id + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLstName() {
		return lstName;
	}
	public void setLstName(String lstName) {
		this.lstName = lstName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(String firstName, String lstName, int id) {
		super();
		this.firstName = firstName;
		this.lstName = lstName;
		this.id = id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, lstName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(lstName, other.lstName);
	}
	
	

}
