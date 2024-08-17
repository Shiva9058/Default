package com.example.demo.collision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Employee {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return id == other.id;
	}

}

public class HashColl {
	public static void main(String... s) {
		Employee1 emp1 = new Employee1("shiva", 12);
		Employee1 emp2 = new Employee1("shivam", 12);

		Map<Employee1, String> empMap = new HashMap<>();
		empMap.put(emp1, "CSE");
		empMap.put(emp2, "IT");

		for (Map.Entry<Employee1, String> em : empMap.entrySet()) {
			System.out.println(em.getKey() + "  " + em.getValue());
		}
	}
}
