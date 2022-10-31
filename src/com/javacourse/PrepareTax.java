//package com.javacourse;
//
//import java.util.Scanner;
//
//public class PrepareTax {
//    public static void main(String[] args) {
//
//        Scanner myscanner = new Scanner(System.in);
//        int user_ssn = myscanner.nextInt();
//        String user_firstname = myscanner.nextLine();
//        String user_lastname = myscanner.nextLine();
//        String user_street = myscanner.nextLine();
//        String user_state = myscanner.nextLine();
//        int user_zip = myscanner.nextInt();
//        int user_income = myscanner.nextInt();
//        String user_status = myscanner.nextLine();
//        int user_tax = myscanner.nextInt();
//        while (user_ssn < 0 & user_zip < 5 & user_income < 0) {
//            user_ssn = myscanner.nextInt();
//            user_zip = myscanner.nextInt();
//            user_income = myscanner.nextInt();
//        }
//        TaxReturn firsttaxreturn= new TaxReturn(1415, "ikechi","wisdom", "NCos Quarters",
//                "Abuja", "FCT", 100901, 100000, "Single", 5000);
//        firsttaxreturn.display();
//    }
//}