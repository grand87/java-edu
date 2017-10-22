package com.alex.jbe.ex15;

public class Main
{
	
	public static void main(String[] strings) {
		
	int a, b, temp;
	   a = 15;
	   b = 27;
	   System.out.println("до замены : a, b = "+a+", "+ + b);
	   temp = a;
	   a = b;
	   b = temp; 
	   System.out.println("после : a, b = "+a+", "+ + b);
	}
}