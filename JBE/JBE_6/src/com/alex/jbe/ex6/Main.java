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

		/* ����� ��������� ����� � ������ ��� �� ������� ���������
		 * �������������� �������� �� int ���������� � ����� ��������� ������������� � String
		 */

		// TODO: ����������� ������� ������� ��������� enum � ������ ��� ������
		System.out.println(value1 + " + " + value2 + " = " + (value1 + value2)) ;
		System.out.println(value1 + " - " + value2 + " = " + (value1 - value2)) ;
		System.out.println(value1 + " x " + value2 + " = " + (value1 * value2)) ;
		System.out.println(value1 + " / " + value2 + " = " + (value1 / value2)) ;
		System.out.println(value1 + " mod " + value2 + " = " + (value1 % value2)) ;
	}

}