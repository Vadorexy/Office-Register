//package com.javacourse;
//
//public class LeftRotation {
//    static void Rotate(int arr[], int d, int a) {
//        int temp[] = new int[a];
//        int k = 0;
//
//        for (int i = d; i < a; i++) {
//            temp[k] = arr[i];
//            k++;
//        }
//
//        for (int i = 0; i < d; i++) {
//            temp[k] = arr[i];
//            k++;
//        }
//
//        for (int i = 0; i < a; i++) {
//            arr[i] = temp[i];
//        }
//    }
//
//    static void PrintTheArray(int arr[], int a) {
//        for (int i = 0; i < a; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5};
//        int a = arr.length;
//        int d = 4;
//        // This is where i called both functions
//        Rotate(arr, d, a);
//        PrintTheArray(arr, a);
//    }
//}
