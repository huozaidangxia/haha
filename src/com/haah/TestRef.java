package com.haah;

import java.util.Date;

public class TestRef {
	public static void main(String[] args) {
//		Obj a = new Obj();
//		Obj b = (Obj) a.clone();
//		b.changeInt();
//		b.changeDate();
//		System.out.println("a: " + a.getInt() + " " + a.getDate());
//		System.out.println("b: " + b.getInt() + " " + b.getDate());
		
		//Class<Ref> c = Ref.class;
		
//		Class<?> c = null;
//		try {
//			c = Class.forName("com.haah.Ref");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Class<?> c = new Ref().getClass();
		System.out.println("className::" + c.getName());
	}
}
