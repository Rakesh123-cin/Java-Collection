package com.rakesh.Miscellaneous;

public class StudentMethodChaining {
	
	private String name;
	private int age;
	private String address;
	
	private StudentMethodChaining()
	{
		
	}
	
	public static StudentMethodChaining of()
	{
		return new StudentMethodChaining();
	}
	public StudentMethodChaining setName(String name) {
		this.name = name;
		return this;
	}
	
	public StudentMethodChaining setAge(int age) {
		this.age = age;
		return this;
	}
	
	public StudentMethodChaining setAddress(String address) {
		this.address = address;
		return this;
	}
	
	@Override
	public String toString() {
		return "StudentMethodChaining [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	
}
