package com.alex.jbe.ex5;

import java.util.Scanner;

public class Main2 {

    static int getData(String text, Scanner inStream) {
        System.out.print(text);
        return inStream.nextInt();
    }
        
    public static void main(String[] args) {
    	System.out.println("Ver2");
    	
        Scanner inStream = new Scanner(System.in);
        
        String text = "Input first number: ";
        int value1 = getData(text, inStream);
        
        String text1 = "Input second number: ";
        int value2 = getData(text1, inStream);
        
        System.out.print(value1*value2);
    }
}
