package com.dspl;

public class Intrest
{
	public void savingIntrest(Saving acc)
	{
		acc.display();
		double tot_amt=acc.base_amt+(acc.intrest_rate*acc.no_of_years);
		System.out.println("Total Intrest on saving amount  :"+tot_amt);
	}
	public void currentIntrest(Current acc)
	{
		acc.display();
		double tot_amt=acc.base_amt+(acc.intrest_rate*acc.no_of_years);
		System.out.println("Total Intrest on current amount:"+tot_amt);
	}
}
