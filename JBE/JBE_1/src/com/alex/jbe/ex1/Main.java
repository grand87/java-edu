package com.alex.jbe.ex1;

public class Main
{

	public static void main(String args[])	
	{
		//две переменные строкового типа
		// = оператор присвоения
		
		//объявление константы - значение объекта переменной нельзя изменить
		final String hello_text = "Hello";
		System.out.println(hello_text);
		
		//создание и инициализация create & init переменной (var\variable) Строкового типа
		String my_name = "Olexiy Sharayenko";
		System.out.println(my_name);
		
		// установка/задание/set нового значения переменной
		my_name = "Vova Sharayenko";
		
		//вызов метода print объекта out с аргументом(c параметром) my_name
		
		System.out.print(my_name);
	}
}