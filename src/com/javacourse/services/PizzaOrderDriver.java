//package com.javacourse;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class PizzaOrderDriver {
//    public static void printWelcomeMessage() {
//        System.out.println("------------------------------------");
//        System.out.println("Welcome to the Pizza Order Program!");
//        System.out.println("------------------------------------");
//    }
//
//    public static void main(String[] args) {
//
//        PizzaOrderDriver pizzaOrderDriver = new PizzaOrderDriver() ;
//        printWelcomeMessage();
//
//
//        switch (pizzaOrderDriver.SelectPizzachoice()){
//            case 1:
//                // process base pizza
//                pizzaOrderDriver. processSelection( 1 )  ;
//                break ;
//            case 2:
//                // process deluxe pizza
//                pizzaOrderDriver. processSelection( 2 )  ;
//                break;
//            default:
//                System.out.println("wrong input selected");
//                //display invalid selection..
//
//        }
//    }
//
//
//public Integer SelectPizzaChoice(){
//
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("""
//                Enter the type pizza you would like to order:
//                1. Base Pizza.
//                2. Deluxe Pizza.""");
//   // int totalPizzas =
//
//            return scanner.nextInt();
//}
//
//
//public  void processSelection(Integer pizzaType ){
//    Scanner scanner = new Scanner(System.in);
//    ArrayList<Pizza> pizzas = new ArrayList<>();
//
//
//
//   // for (int i = 0; i < totalPizzas; ++i)
//
//        Pizza pizza = new Pizza();
//
//
//        pizza.setPizzaType(pizzaType);
//        //ArrayList<String> toppings = new ArrayList<>();
//
//        Integer pizzaSize;
//        System.out.println(
//                """
//                Enter the verity pizza you would like to order:
//                1. Vegetarian Pizza.
//                2. Non-vegetarian Pizza.""");
//
//        pizzaSize = scanner.nextInt();
//        pizza.setPizzaVeriety(pizzaSize);
//
//        Map<String, Integer> addtoppings = new HashMap<>() ;
//
//        int totalToppings;
//        System.out.println("Enter the total amount of toppings for cheese on the pizza: ");
//        totalToppings = scanner.nextInt();
//        addtoppings.put("cheese",totalToppings ) ;
//
//        System.out.println("Enter the total amount of toppings for ketchup on the pizza: ");
//        totalToppings = scanner.nextInt();
//        addtoppings.put("ketchup",totalToppings ) ;
//
//        pizza.setMytoppings(addtoppings);
//
//
//
////
////        for (int j = 0; j < totalToppings; ++j) {
////            System.out.println("Enter the topping: ");
////            String topping = scanner.next();
////            toppings.add(topping);
////        }
//
//      //  pizza.setToppings(toppings);
//        pizzas.add(pizza);
//
//
//    PizzaOrder order = new PizzaOrder(pizzas);
//    order.calculateTotalOrderCost();
//    order.printOrderSummary();
//
//
//}
//
//
//    public  void processSelection2(Integer totalPizzas ){
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Pizza> pizzas = new ArrayList<>();
//
//
//        for (int i = 0; i < totalPizzas; ++i)
//        {
//            Pizza pizza = new Pizza();
//
//            ArrayList<String> toppings = new ArrayList<>();
//
//            String pizzaSize;
//            System.out.println("Enter the variety of the pizza: Vegetarian and Non-vegetarian ? ");
//            pizzaSize = scanner.next();
//            pizza.setSize(pizzaSize);
//
//            Map<String, Integer> addtoppings = new HashMap<>() ;
//
//            int totalToppings;
//            System.out.println("Enter the total amount of toppings for cheese on the pizza: ");
//            totalToppings = scanner.nextInt();
//            addtoppings.put("cheese",totalToppings ) ;
//
//            System.out.println("Enter the total amount of toppings for ketchup on the pizza: ");
//            totalToppings = scanner.nextInt();
//            addtoppings.put("ketchup",totalToppings ) ;
//
//            pizza.setMytoppings(addtoppings);
//
//
//
////
////        for (int j = 0; j < totalToppings; ++j) {
////            System.out.println("Enter the topping: ");
////            String topping = scanner.next();
////            toppings.add(topping);
////        }
//
//            //  pizza.setToppings(toppings);
//            pizzas.add(pizza);
//        }
//
//        PizzaOrder order = new PizzaOrder(pizzas);
//        order.calculateTotalOrderCost();
//        order.printOrderSummary();
//
//
//    }
//
//}
