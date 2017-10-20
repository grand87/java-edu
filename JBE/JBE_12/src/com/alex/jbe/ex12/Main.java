package com.alex.jbe.ex12;

import java.util.Scanner;

public class Main {

    static int getData(String text, Scanner inStream) {
        System.out.print(text);
        return inStream.nextInt();
    }
        
    public static void main(String[] args) {
    	
    	Scanner inStream = new Scanner(System.in);
    	
    	 String text = "Input first number: ";
         int num1 = getData(text, inStream);
         
         String text1 = "Input second number: ";
         int num2 = getData(text1, inStream);
         
         String text2 = "Input fifth number: ";
         int num3 = getData(text2, inStream);
         
         System.out.print("averages of three numbers:" + (num1 + num2 + num3) / 3 );
         
            
         
         
    }
    }