package com.interfaceDemo;

import com.dspl.Saving;

public class Application {

	public static void main(String[] args) 
	{	
		Transaction trans1=new Transaction();
		Saving saving = new Saving(101, "Yogesh", "Pune", 2, 2000, 2);
//		trans1.display();
		printDetails(trans1);
		printDetails(saving);
		
	}

	
	public static void printDetails(Printable p){
		p.display();
	}
}
