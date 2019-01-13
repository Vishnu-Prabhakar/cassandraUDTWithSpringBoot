package com.example.cassandraudt.model;

import java.util.List;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.datastax.driver.mapping.annotations.Frozen;

@Table("employee")
public class Employee {
	
	@Column("id")
	@PrimaryKey
	private String id;
	
	@Column("first_Name")
	private String firstName;
	
	@Column("last_Name")
	private String lastName;
	
	
	@Column("department")
	private String department;
	
	@Frozen
	@Column("list_address")
	private List<Address> addressList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	
	public Employee() {
		// Default Constructor
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", department=");
		builder.append(department);
		builder.append(", addressList=");
		builder.append(addressList);
		builder.append("]");
		return builder.toString();
	}

	
}
