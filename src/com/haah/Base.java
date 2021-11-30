package com.haah;

public class Base {
	public int i = 1;
	
	public Base() {
		g();
		System.out.println(111);
		System.out.println(222);
		System.out.println(333);
		System.out.println(6666);
	}
	
	public void f() {
		System.out.println("base f()");
	}
	
	public void g() {
		System.out.println("base g()");
	}
}

class comm extends Base {
	public int i = 3;
	
	public void f() {
		System.out.println("comm f()");
	}
	
	public void g() {
		System.out.println("comm g()");
	}
}
