package com.alex.jbe.ex6;

import java.util.Scanner;

public class Main {
	
	private static Scanner stream;

	public static void main(String[] args) {
		
		stream = new Scanner(System.in);
		
		String text = "Input first number: ";
		System.out.print(text);
		int value1 = stream.nextInt();
		
		String text1 = "Input second number: ";
		System.out.print(text1);
		int value2 = stream.nextInt();
		
		System.out.println(value1+value2);
		System.out.println(value1-value2);
		System.out.println(value1*value2);
		System.out.println(value1/value2);
		System.out.println(value1 % value2);
	}
	
}