package com.alex.jbe.ex7;

import java.util.Scanner;

public class Main {

     static int getData(String text, Scanner inStream) {
            System.out.print(text);
            return inStream.nextInt();
     }

     public static void main(String[] args) {
          Scanner inStream = new Scanner(System.in);

          int value = getData("Input number: ", inStream);

          for (int i = 1; i <= 10; i++) {
              /* изучи как формируется строка которая печатается:
               * она состоит из подстрок которые соеденяются (конкатенация) оператором `+`
               *    String a = "1";
               *    String b = "2";
               *    String c = a + b; //c == "12";
               * Java умеет на лету преобразовывать некоторые типы к String
               * в выражение ниде Java автоматом преобразует все int в String и соеденяет все String благодаря оператору "+"
               */
              System.out.println(value +" x " + i + " = " + value * i);
          }
     }
}