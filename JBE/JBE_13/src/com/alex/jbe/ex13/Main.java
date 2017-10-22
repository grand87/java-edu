package com.alex.jbe.ex13;

public class Main
{
	
	public static void main(String[] strings) {
		
		final double width = 5.6;
        final double height = 8.5;
        
        double perimeter = 2*(height + width);
        double area = width * height;
        
        
        System.out.print ("Area is 5.6 * 8.5 = " + area + " \n " +  "Perimeter is 2*(5.6+8.5)=" + perimeter);
		
		// только что то не правильно считает площадь
		
		
	}
}