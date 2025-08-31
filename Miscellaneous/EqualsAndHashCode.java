package com.rakesh.Miscellaneous;

import java.util.Objects;

class Employee
{
	int id;
	String name;
	
	public Employee(int id , String name)
	{
		this.id= id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
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
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class EqualsAndHashCode {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(56078,"Rakesh Anand");
		Employee e2 = new Employee(56078,"Rakesh Anand");
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	}

}
