package com.haah;

public class Base {
	public int i = 1;

	public Base() {
		g();
		System.out.println(111);
		System.out.println(222);
		System.out.println(333);
		System.out.println(6666);
		System.out.println(777);
		System.out.println("hot-fix");
	}
	
	public void f() {
		System.out.println("base f()");
	}
	
	public void g() {
		System.out.println("base g()");
	}
}

class Comm extends Base {
	public int i = 3;

	@Override
	public void f() {
		System.out.println("comm f()");
	}

	@Override
	public void g() {
		System.out.println("comm g()");
	}
}
