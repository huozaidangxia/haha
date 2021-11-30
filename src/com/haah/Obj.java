package com.haah;

import java.util.Date;

public class Obj implements Cloneable {
	private int a = 0;
	private Date date = new Date();
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public void changeDate() {
		this.date.setMonth(6);
	}

	public int getInt() {
		return a;
	}
	
	public void setInt(int int1) {
		a = int1;
	}
	
	public void changeInt() {
		this.a = 1;
	}
	
	public Object clone() {
		Obj o = null;
		try {
			o = (Obj) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		o.date = (Date)this.getDate().clone();
		
		return o;
	}
}
