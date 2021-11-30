package com.haah;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class Ref {
	private int num = 10;
	
	public int getNum() {
		return num;
	}

	class Inner{
		
	}
	private int a = 5;
	
	protected Ref() {
		System.out.println("protected constructor");
	}
	
	public Ref(String name) {
		System.out.println("public constructor" + name);
	}
	
	private Ref(String name, int age) {
		System.out.println("public constructor" + name + age);
	}
	
	public void f() {
		System.out.println("f()");
	}
	
	void g(int i) {
		System.out.println("g()" + i);
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Class<?> c = null;
		try {
			c = Class.forName("com.haah.Ref");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
//		Class<?>[] clazz = c.getDeclaredClasses();
//		for (Class<?> class1 : clazz) {
//			System.out.println(class1);
//		}
//		
//		Method[] methods = c.getMethods();
//		for (Method method : methods) {
//			System.out.println(method);
//		}
		
		Field field = c.getDeclaredField("num");
		field.setAccessible(true);
		Ref ref = new Ref();
		field.set(ref, 30);
		System.out.println(ref.getNum());
		
//		Constructor<?> constructors = c.getConstructor(String.class, Integer.class);
//		System.out.println(constructors);
//		for (Constructor<?> co : constructors) {
//			System.out.println(co);
//		}
	}
	
	@Test
	public void test() {
		
		
	}
}

