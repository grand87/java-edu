package com.alex.jbe.ex6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stream = new Scanner(System.in);

		String text = "Input first number: ";
		System.out.print(text);
		int value1 = stream.nextInt();

		String text1 = "Input second number: ";
		System.out.print(text1);
		int value2 = stream.nextInt();

		/* здесь выражения взяты в скобки что бы сначала выполнить
		 * арифметическую операцию на int значениями а потом результат преобразовать к String
		 */

		// TODO: реализовать функцию которая принимает enum и данные для вывода
		System.out.println(value1 + " + " + value2 + " = " + (value1 + value2)) ;
		System.out.println(value1 + " - " + value2 + " = " + (value1 - value2)) ;
		System.out.println(value1 + " x " + value2 + " = " + (value1 * value2)) ;
		System.out.println(value1 + " / " + value2 + " = " + (value1 / value2)) ;
		System.out.println(value1 + " mod " + value2 + " = " + (value1 % value2)) ;
	}

}