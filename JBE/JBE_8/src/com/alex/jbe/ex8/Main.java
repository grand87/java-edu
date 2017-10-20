package com.alex.jbe.ex8;

import java.util.ArrayList;

public class Main
{

	private static void print1()
	{
		final String text1 = "   J    a   v     v   a";
		final String text2 = "   J   a a   v   v   a a";
		final String text3 = "J  J  aaaaa   V V   aaaaa";
		final String text4 = " JJ  a     a   V   a     a";
		System.out.println(text1 + "\n" + text2 + "\n" + text3 + "\n" + text4 );
	}

	private static void print2()
	{
		System.out.println("   J    a   v     v   a");
		System.out.println("   J   a a   v   v   a a");
		System.out.println("J  J  aaaaa   V V   aaaaa");
		System.out.println(" JJ  a     a   V   a     a");
	}

	private static void print3()
	{
		//вариант реализации Списка Строк - https://habrahabr.ru/post/128269/
		ArrayList<String> str = new ArrayList<String>();
		str.add("   J    a   v     v   a");
		str.add("   J   a a   v   v   a a");
		str.add("J  J  aaaaa   V V   aaaaa");
		str.add(" JJ  a     a   V   a     a");

		//цикл for each - поддерживает обход по Java Collections - https://vertex-academy.com/tutorials/ru/cikl-for-each/
		for(String s : str) {
			System.out.println(s);
		}
	}

	public static void main(String args[])
	{
		System.out.print("Variant 1:\n");
		print1();
		System.out.print("Variant 2:\n");
		print2();
		System.out.print("Variant 2:\n");
		print3();
	}

}