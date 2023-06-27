//package com.javacourse;
//
//import java.text.NumberFormat;
//import java.util.ArrayList;
//
//public class PizzaOrder {
//    private double totalOrderCost;
//
//    private final ArrayList<Pizza> pizzas;
//
//    public PizzaOrder(ArrayList<Pizza> pizzas) {
//        this.pizzas = pizzas;
//    }
//
//    public void calculateTotalOrderCost() {
//        final double LARGE_COST = 4500;
//        final double MEDIUM_COST = 6000;
//        final double COST_PER_TOPPING = 1000;
//
//        for (Pizza pizza : pizzas) {
//            switch (pizza.getPizzaVeriety()) {
//                case 1:
//                    totalOrderCost += LARGE_COST;
//                    break;
//                case 2:
//                    totalOrderCost += MEDIUM_COST;
//                    break;
//                default:
//                    totalOrderCost += 0.0;
//                    break;
//            }
//
//         //   int totalToppings = pizza.getToppings().size();
//         int noofcheese =   pizza.getMytoppings().get("cheese") ;
//            int noofke =   pizza.getMytoppings().get("ketchup") ;
//
//            int totalToppings = noofcheese + noofketchup ;
//
//            totalOrderCost += totalToppings * COST_PER_TOPPING;
//        }
//    }
//
//    public double getTotalOrderCost() {
//        return totalOrderCost;
//    }
//
//    public void printOrderSummary() {
//        for (Pizza pizza : pizzas) {
//            System.out.println("Ordered a " + selectTypeName(pizza.getPizzaType()) +" - "  + selectVerityName( pizza.getPizzaVeriety())+ " pizza with " +    pizza.getMytoppings());
//        }
//        System.out.println("TOTAL ORDER AMOUNT: " +  (getTotalOrderCost()) );
//    }
//
//    String selectVerityName(Integer value){
//        String name ="" ;
//        switch (value){
//         case   1:
//             name = "Vegit" ;
//            break ;
//          case   2:
//              name = "non-vegi" ;
//            break;
//            default:
//
//
//        }
//
//        return  name ;
//    }
//
//    String selectTypeName(Integer value){
//        String name ="" ;
//        switch (value){
//            case   1:
//                name = "del" ;
//                break ;
//            case   2:
//                name = "base" ;
//                break;
//            default:
//
//
//        }
//
//        return  name ;
//    }
//
//}
