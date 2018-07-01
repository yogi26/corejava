package com.dspl;

import java.util.Scanner;

public class Application{

		public static void main(String[] args) 
		{
			int type,acc_no,facility,no_of_years;
			String name,address,ch;
			double base_amt;
			Scanner input=new Scanner(System.in);
			
			Branch branch=new Branch();
			Intrest intrest=new Intrest();
			Saving saving;
			Current current;
					
		while(true)
		{
			System.out.println("Select account type to find interest rate(for saving press 0 and for current 1)");
			type=input.nextInt();
			switch(type)
			{
				case 0:	System.out.println("Enter Account number");
						acc_no=input.nextInt();
						
						
						System.out.println("Enter Name");
						name=input.next();
					
						System.out.println("Enter Address");
						address=input.next();
						
						System.out.println("Do your bank have any branch (Y/N)");
						ch=input.next();
						if(ch.charAt(0)=='Y')
						{
							branch.setBranch();
						}
					
						System.out.println("If your bank have netbanking facility then press 1 else press 0");
						facility=input.nextInt();
					
						System.out.println("Enter base amount");
						base_amt=input.nextDouble();
						
						System.out.println("Enter No of years");
						no_of_years=input.nextInt();
						
						saving=new Saving(acc_no,name,address,facility,base_amt,no_of_years);
						
						
						intrest.savingIntrest(saving);
						branch.getBranch();
						
						break;
				case 1:	System.out.println("Enter Account number");
						acc_no=input.nextInt();
						
						System.out.println("Enter Name");
						name=input.next();
					
						System.out.println("Enter Address");
						address=input.next();
						
						System.out.println("Do your bank have any branch (Y/N)");
						ch=input.next();
						if(ch.charAt(0)=='Y')
						{
							new Branch().setBranch();
						}
					
						System.out.println("If your bank have netbanking facility then press 1 else press 0");
						facility=input.nextInt();
					
						System.out.println("Enter base amount");
						base_amt=input.nextDouble();
						
						System.out.println("Enter No of years");
						no_of_years=input.nextInt();
						
						current=new Current(acc_no,name,address,facility,base_amt,no_of_years);
						intrest.currentIntrest(current);
						branch.getBranch();
						break;
				default: System.out.println("Please enter valid input");

 			}
			
		}
		
	}

}
