package com.alex.jbe.ex11;

public class Main
{
   public static final double r = 7.5; 

	public static void main(String args[])	
	{
	 final double r = 7.5;
	
	double Perimeter  = 2 * Math.PI * r;
	
	double Area = Math.PI*(r*r);
			
		
		System.out.print( "Perimeter is = " +  Perimeter + "\n" + " Area is= " + Area );	
	}
	}