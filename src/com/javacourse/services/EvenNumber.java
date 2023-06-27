//package com.javacourse;
//
//import java.util.Scanner;
//
//public class EvenNumber {
//        public static void main(String[] args) {
//
//        int number;
//
//        int result;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter an even number or 999 to exit: ");
//
//        number = input.nextInt();
//
//        result = number % 2;
//
//        while (number != 999) {
//
//            while (result != 0) {
//
//                System.out.println(number + " is not an even number");
//
//                System.out.print("Please enter an even number? ");
//
//                number = input.nextInt();
//
//                result = number % 2;
//
//            }
//
//            System.out.println("Good job!");
//
//            System.out.print("Enter an even number or 999 to exit... ");
//
//            number = input.nextInt();
//
//            result = number % 2;
//
//        }
//    }
//}
