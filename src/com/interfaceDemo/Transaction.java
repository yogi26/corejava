package com.interfaceDemo;

public class Transaction implements Printable
{
	int trans_id;
	double time;
	String trans_type;
	public Transaction()
	{
		this.trans_id=10011;
		this.time=11;
		this.trans_type="mobile";
	}
	public void display()
	{
		System.out.println("\nTransaction ID-->"+trans_id+"\nTransaction Time-->"+time+"\nTransaction type-->"+trans_type);
	}
}
