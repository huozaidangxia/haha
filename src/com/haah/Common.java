package com.haah;

public class Common extends Base {
	private static int b = 6;
	
	static {
		System.out.println("common��̬�����һһһһִ��");
	}
	
	static {
		System.out.println("common��̬������������ִ��");
	}
	
	public Common() {
		System.out.println("common���췽��ִ��");
	}
	
	public void Common() {
		System.out.println("call common");
	}
	
	public static void main(String[] args) {
		new Common().Common();
	}
	
	{
		System.out.println("common��=========��̬�����һһһһִ��");
	}
	
	{
		System.out.println("common��=========��̬������������ִ��");
	}

}
