package com.alex.jbe.ex7;

import java.util.Scanner;

public class Main {
	
	
	 static int getData(String text, Scanner inStream) {
	        System.out.print(text);
	        return inStream.nextInt();
	 }
        public static void main(String[] args) {
        	  Scanner inStream = new Scanner(System.in);
              
              String text = "Input number: ";
              int value1 = getData(text, inStream);
              
              for (int i=1; i< 11; i++){
              
              System.out.println(value1 *i);
              
              
}
}
}	