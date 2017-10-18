package com.alex.jbe.ex5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Ver1");
		
		Scanner inStream = new Scanner(System.in);
		
		String text = "Input first number: ";
		System.out.print(text);
		int value1 = inStream.nextInt();
		
		String text1 = "Input second number: ";
		System.out.print(text1);
		int value2 = inStream.nextInt();
		
		
		System.out.print(value1*value2);
	}
}
