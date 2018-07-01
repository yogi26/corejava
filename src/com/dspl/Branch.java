package com.dspl;

import java.util.Scanner;

public class Branch
{
	Scanner input=new Scanner(System.in);
	
	public String city,street_name,land_mark,ifsc_code;
	public int pincode;
	public void setBranch()
	{
		System.out.println("Enter City");
		city=input.next();
		System.out.println("Enter Street Name");
		street_name=input.next();
		System.out.println("Enter Land Mark");
		land_mark=input.next();
		System.out.println("Enter IFSC Code");
		ifsc_code=input.next();
		System.out.println("Enter Pincode");
		pincode=input.nextInt();
	}
	public void getBranch()
	{
		System.out.println("---------------------------------------------");
		System.out.println("City :"+city);
		System.out.println("Street Name :"+street_name);
		System.out.println("Land Mark :"+land_mark);
		System.out.println("IFSC Code:"+ifsc_code);
		System.out.println("Pincode:"+pincode);
	}
}
