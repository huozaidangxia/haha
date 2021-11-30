package com.haah;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	protected void run() {
		System.out.println(12);
	}
	
	public static void main(String[] args) {
		System.out.println("Aa".hashCode());
		System.out.println("BB".hashCode());
	}
}
