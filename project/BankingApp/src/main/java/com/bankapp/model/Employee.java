package com.bankapp.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String employee_id;
	private String city;
	private int age;
	private String gender;
	
	
	public Employee(String firstName, String lastName, String city, int age, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.age = age;
		this.gender = gender;
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
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employee_id=" + employee_id
				+ ", city=" + city + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	

}
