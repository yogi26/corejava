package com.dspl;
public class Account 
{
	protected int Acc_no;
	protected String cust_name,address;
	
	protected int facility;
	
	public Account()
	{
	}
	public Account(int ac_no,String cust_name,String address,int facility)
	{
		this.Acc_no=ac_no;
		this.cust_name=cust_name;
		this.address=address;
		this.facility=facility;
	}
	public void display()
	{
		System.out.println("\n Account No  : "+Acc_no+"\n Name  : "+cust_name+"\n Address  :"+address);
		//new Branch().getBranch();
	}
}
