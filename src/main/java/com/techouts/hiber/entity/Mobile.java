package com.techouts.hiber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Mobile 
{
	@Id
	private int mobile_Id;
	private String mobile_Name;
	private String mobile_Color;
	private double mobile_Price;
	
	public Mobile()
	{
		super();
	}

	public Mobile(int mobile_Id, String mobile_Name, String mobile_Color, double mobile_Price) 
	{
		super();
		this.mobile_Id = mobile_Id;
		this.mobile_Name = mobile_Name;
		this.mobile_Color = mobile_Color;
		this.mobile_Price = mobile_Price;
	}

	public int getMobile_Id() {
		return mobile_Id;
	}

	public void setMobile_Id(int mobile_Id) {
		this.mobile_Id = mobile_Id;
	}

	public String getMobile_Name() {
		return mobile_Name;
	}

	public void setMobile_Name(String mobile_Name) {
		this.mobile_Name = mobile_Name;
	}

	public String getMobile_Color() {
		return mobile_Color;
	}

	public void setMobile_Color(String mobile_Color) {
		this.mobile_Color = mobile_Color;
	}

	public double getMobile_Price() {
		return mobile_Price;
	}

	public void setMobile_Price(double mobile_Price) {
		this.mobile_Price = mobile_Price;
	}

	@Override
	public String toString() {
		return "Mobile [mobile_Id=" + mobile_Id + ", mobile_Name=" + mobile_Name + ", mobile_Color=" + mobile_Color
				+ ", mobile_Price=" + mobile_Price + "]";
	}
}
