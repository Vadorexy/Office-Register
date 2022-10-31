//package com.javacourse;
//
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class JavaHashSet {
//    public static void main(String[] args) {
////        HashSet<String> cars = new HashSet<String>();
////        cars.add("BMW");
////        cars.add("Ford");
////        cars.add("Tesla");
////        cars.add("BMW");
////        System.out.println(cars);
//
////        HashSet<String> student = new HashSet<String>();
////        Scanner myScanner = new Scanner(System.in);
////        System.out.println("Student name? ");
////        String name = myScanner.nextLine();
////        student.add(name);
////        System.out.println(student.size());
////
////      HashSet<String> store = new HashSet<String>();
////      Scanner myScanner = new Scanner(System.in);
////        System.out.println("Add goods bought by the grocery store? ");
////        String name = myScanner.nextLine();
////        store.add(name);
////        System.out.println("Goods available in the grocery  store? ");
//////        name = myScanner.nextLine();
////        store.add("Cloths");
////        store.add("Bread");
////        store.add("Wines");
////        store.add("Cakes");
////        System.out.println(store);
////        System.out.println();
//
//        HashSet<String> store = new HashSet<>();
//        System.out.println("Grocery Store Appication");
//        System.out.println("What do you intend to do? ");
//        System.out.println("Select 1 to add goods to the store? ");
//        System.out.println("Select 2 to delete goods available in the store? ");
//        System.out.println("Select 3 to display goods in the store? ");
//        Scanner myScanner = new Scanner(System.in);
//        int option = myScanner.nextInt();
//        if (option == 1) {
//            System.out.println("What no. of goods do you want to add to the store? ");
//            int no_of_goods = myScanner.nextInt();
//            for (int i = 0; i < no_of_goods; i++) {
//                String goods = myScanner.next();
//                store.add(goods);
//            }
//
//        } else if (option == 2) {
//            System.out.println("What will no. of goods do you want to delete from the store? ");
//            int no_of_goods = myScanner.nextInt();
//            for (int i = 0; i < no_of_goods; i++) {
//                String goods = myScanner.next();
//                store.remove(goods);
//            }
//        } else if (option == 3) {
//            System.out.println(store);
//        }
//    }
//}