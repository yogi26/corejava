package com.dspl;

public class Current extends Account
{
	public double base_amt;
	public int no_of_years;
	public double intrest_rate;
	public Current()
	{
		
	}
	public Current(int ac_no,String cust_name,String address, int facility,double base_amt, int no_of_years)
	{
		
		super(ac_no,cust_name,address,facility);
		
		this.intrest_rate=7.99;
		this.base_amt=base_amt;
		this.no_of_years=no_of_years;
	
	}
}
