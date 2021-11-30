package com.haah;

public class Common extends Base {
	private static int b = 6;
	
	static {
		System.out.println("common静态代码块一一一一执行");
	}
	
	static {
		System.out.println("common静态代码块二二二二执行");
	}
	
	public Common() {
		System.out.println("common构造方法执行");
	}
	
	public void Common() {
		System.out.println("call common");
	}
	
	public static void main(String[] args) {
		new Common().Common();
	}
	
	{
		System.out.println("common非=========静态代码块一一一一执行");
	}
	
	{
		System.out.println("common非=========静态代码块二二二二执行");
	}

}
