//public class Main {
// Code from filename: Main.java
// abstract class
//abstract class Main {
//    public String fname = "John";
//    public int age = 24;
//    public abstract void study(); // abstract method
//}
//
//// Subclass (inherit from Main)
//class Student extends Main {
//    public int graduationYear = 2018;
//    public void study() { // the body of the abstract method is provided here
//        System.out.println("Studying all day long");
//    }
//}
//// End code from filename: Main.java
//
//// Code from filename: Second.java
//class Second {
//    public static void main(String[] args) {
//        // create an object of the Student class (which inherits attributes and methods from Main)
//        Student myObj = new Student();
//
//        System.out.println("Name: " + myObj.fname);
//        System.out.println("Age: " + myObj.age);
//        System.out.println("Graduation Year: " + myObj.graduationYear);
//        myObj.study(); // call abstract method
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int x = 10;
//        int y = 5;
//        System.out.println(x + y);
//    }
//}
//
//class OuterClass {
//    int x =  10;
//}
//
//class InnerClass {
//    int y = 5;
//}
//
//public class Main {
//    public static void main(String[] args) {
//        OuterClass myOuter = new OuterClass();
//        InnerClass myInner = new InnerClass();
//        System.out.println(myInner.y + myOuter.x);
//    }
//}


//BookStoreCredit.java Exercise Solutions 2

//import java.util.Scanner;
//
//class BookstoreCredit {
//
//    static int myNum(float x, int y) {
//        return (int) (x * y);
//    }
//
//    public static void main(String[] args) {
//        Scanner myCredit = new Scanner(System.in);
//        System.out.println("Please Enter Your Name? ");
//        String name = myCredit.nextLine();
//        System.out.println("Please Enter Your CGPA? ");
//        myCredit.nextFloat();
//        System.out.println("Your Name And Your CGPA Has Been Entered Successfully!!!  In order to encourage good grades, Hermosa\n" +
//                "High School has decided to award you as a\n" +
//                "student a bookstore credit that is\n" +
//                "1000 times each student’s grade point\n" +
//                "average.");
//        int myNum1 = myNum(4.2f, 1000);
//        System.out.println("Your CGPA is " + myNum1);
//    }
//}

//Insurance.java Exercise 6

//import java.util.Scanner;
//
//class Insurance {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Input your current year? ");
//        int currentyear = myScanner.nextInt();
//        System.out.println("Input your Birth Year? ");
//        int birthyear = myScanner.nextInt();
//        System.out.println("$" + (calculatepremium(currentyear, birthyear)));
//    }
//    public static int calculatepremium(int currentyear, int birthyear) {
//        int age = currentyear - birthyear;
//        int decade = age / 10;
//        int premuim = (decade + 15) * 20;
//        System.out.println(premuim);
//        return premuim;
//    }
//}

//JAVA CLASSES AND OBJECTS() SOLUTION
//
//import java.util.Scanner;
//
//class JobPricing {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Input the name of job? ");
//        String name = myScanner.nextLine();
//        System.out.println("Input the cost of material? ");
//        int cost = myScanner.nextInt();
//        System.out.println("Input the total hour on job? ");
//        int time = myScanner.nextInt();
//        System.out.println("Input the total hour to job site? ");
//        int distance = myScanner.nextInt();
////        System.out.println(name);
//        System.out.println(name + " The job estimate is $" +(computeNumber(cost,time,distance)));
//    }
//    public static int computeNumber(int cost, int time, int distance) {
//        int material = (cost +(time + 35));
//        int jobCost = (material +(distance + 12));
//        System.out.println(jobCost);
//        return jobCost;
//    }
//}

//Polymorphism(FormLetterWriter) Exercise 1
//
//class FormLetterWriter {
//    public void displaySalutation() {
//           }
//}
//
//class Lastname extends FormLetterWriter {
//    public void displaySalutation() {
//        System.out.println("Dear Mr. Wisdom, ");
//    }
//}
//
//class FLName extends FormLetterWriter {
//    public void displaySalutation() {
//        System.out.println("Dear Wisdom Ikechi, Thank\n" +
//                "you for your recent order.");
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        FormLetterWriter myLast = new Lastname();  // Create a Lastname object
//        FormLetterWriter myName = new FLName();  // Create a First and Last name object
//        myLast.displaySalutation();
//        myName.displaySalutation();
//    }
//}

//(Billing) Exercise 2
//
//class Billing {
//    static int computeBill(int x, int y) {
//        return x + y;
//    }
//}
//
//class First extends Billing {
//    static int computeBill(int a, int b, int c) {
//        return a * b + c;
//    }
//}
//
//class Last extends Billing {
//    static int computeBill(int m, int n, int o, int p) {
//       return m * n - o + p;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Billing myBilling = new Billing();  // Create a Billing object
//        Billing myFirst = new First();  // Create a First object
//        Billing myLast = new Last();  // Create a Last object
//        Billing.computeBill(100,8);
//        First.computeBill(100,2,8);
//        Last.computeBill(100,10,50,8);
//        System.out.println();
//    }
//}

//PaintCalculator Exercise 5
//
//import java.util.Scanner;
//
//class PaintCalculator {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Input the length!!");
//        double length = myScanner.nextDouble();
//        System.out.println("Input the width!!");
//        double width = myScanner.nextDouble();
//        System.out.println("Input the height!!");
//        double height = myScanner.nextDouble();
//        double areavalue = area(length, width, height);
//        paint(areavalue);
//    }
//    public static double area(double length, double width, double height){
//        return length * width * height;
//    }
//    public static void paint(double areavalue) {
//        System.out.println(areavalue / 350);
//    }
//}

//InchConversion Exercise 4

//import java.util.Scanner;
//
//class InchConversion {
//    public static void inchtofeet (int inchvalue) {
//        System.out.println("Inch to yard value is " + inchvalue * 12);
//    }
//    public static void inchtoyard (int inchvalue) {
//        System.out.println("Inch to yard value is " + inchvalue * 36);
//    }
//
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Input the value for Inch");
//        int inchvalue = myScanner.nextInt();
//        inchtofeet(inchvalue);
//        inchtoyard(inchvalue);
//    }
//}

//Percentage Exercise 3

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//class Percentage {
//    public static void main(String[] args) {
//        System.out.println(computePercentage(10.5, 11.5));
//        System.out.println(computePercentage1(10.5, 11.5));
//    }
//
//    public static double computePercentage(double x, double y) {
//        return x / y * 100;
//    }
//
//    public static double computePercentage1(double x, double y) {
//        return y / x * 100;
//    }
//}
//Percentage Correction
//class Percentage {
//    public static void computePercentage () {
//        Scanner myscanner = new Scanner(System.in);
//        System.out.println("Names of Political Parties? ");
//        System.out.println("Political Party 1 ?");
//        myscanner.next();
//        System.out.println("Number of Votes ? ");
//        myscanner.nextDouble();
//        System.out.println("Political Party 2 ?");
//        myscanner.next();
//        System.out.println("Number of Votes ? ");
//        myscanner.nextDouble();
//        System.out.println("Political Party 3 ?");
//        myscanner.next();
//        System.out.println("Number of Votes ? ");
//        myscanner.nextDouble();
//        System.out.println("The percentage is : " + (myscanner.nextDouble() * 100));
//    }
//    public static void main(String[] args) {
//        computePercentage();
//    }
//}
//
//import java.util.Scanner;
//
//class Percentage2 {
//        public static void computePercentage (double firstvalue, double secondvalue) {
//        System.out.println("firstvalue" + firstvalue);
//        System.out.println("secondvalue" + secondvalue);
//        double firstvaluedividesecondvalue = firstvalue / secondvalue;
//        System.out.println("The percentage is : " + (firstvaluedividesecondvalue * 100));
//    }
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in)
//        double firstvalue = 10.5;
//        double secondvalue = 11.5;
//        computePercentage(firstvalue, secondvalue);
//        computePercentage(secondvalue, firstvalue);
//

//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(12);
//        numbers.add(8);
//        numbers.add(2);
//        numbers.add(23);
//        Iterator<Integer> it = numbers.iterator();
//        while(it.hasNext()) {
//            Integer i = it.next();
//            if(i < 10) {
//                it.remove();
//            }
//        }
//        System.out.println(numbers);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Integer myInt = 100;
//        String myString = myInt.toString();
//        System.out.println(myString.length());
//    }
//}

//public class Main {
//    public static void main(String[ ] args) {
//        try {
//            int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[10]);
//        } catch (Exception e) {
//            System.out.println("Something went wrong.");
//        }
//    }
//}
//
//public class Main {
//    static void checkAge(int age) {
//      if (age < 18) {
//          throw new ArithmeticException("Access denied - You must be at least 18 years old. ");
//      }
//      else {
//          System.out.println("Access granted. You're old enough!. ");
//      }
//    }
//
//    public static void main(String[] args) {
//     checkAge(20);
//    }
//}

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

//public class Main {
//    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("HiiT Institution", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher("Visit HiiT Institution!. ");
//        boolean matchFound = matcher.find();
//        if (matchFound){
//            System.out.println("Match Found!. ");
//        }
//        else {
//            System.out.println("Match Not Found!. ");
//        }
//    }
//}

//public class Main extends Thread{
//    public static void main(String[] args) {
//        Main thread = new Main();
//        thread.start();
//        System.out.println("This code is outside of a thread. ");
//    }
//    public void run(){
//        System.out.println("This code is running a thread. ");
//    }
//}
//
//public class Main extends Thread {
//    public static int amount = 2;
//
//    public static void main(String[] args) {
//        Main thread = new Main();
//        thread.start();
//        // Wait for the thread to finish
//        while(thread.isAlive()) {
//            System.out.println("Waiting...");
//        }
//        // Update amount and print its value
//        System.out.println("Main: " + amount);
//        amount++;
//        System.out.println("Main: " + amount);
//    }
//    public void run() {
//        amount++;
//    }
//}
//
//import java.util.ArrayList;
//import java.util.function.Consumer;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> number = new ArrayList<Integer>();
//        number.add(4);
//        number.add(5);
//        number.add(8);
//        number.add(9);
//        Consumer<Integer> method = (n) -> {
//            System.out.println(n);
//        }; number.forEach(method);
//    }

import java.util.Scanner;
//public class Main {
//    public static void main(String a[]) {
//        Scanner s=new Scanner(System.in);
//        int years;
//        double savings;
//        System.out.println(" Number of years the user has until retirement");
//        years=s.nextInt();
//        while(years<=0)
//        {
//
//            System.out.println(" Please enter a valid number");
//            years=s.nextInt();
//        }
//        System.out.println(" Enter amount of money you can save anually");
//        savings=s.nextDouble();
//        while(savings<=0)
//        {
//
//            System.out.println(" Please enter a valid number");
//            savings=s.nextDouble();
//        }
//        System.out.println("Total savings after "+years+ "years = "+savings*years);
//    }
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        int num;
//
//        int result;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please enter an even number or 999 to exit: ");
//
//        num = input.nextInt();
//
//        result = num % 2;
//
//        while (num != 999) {
//
//            while (result != 0) {
//
//                System.out.println(num + " is not an even number");
//
//                System.out.print("Please enter an even numbern");
//
//                num = input.nextInt();
//
//                result = num % 2;
//
//            }
//
//            System.out.println("Good job!");
//
//            System.out.print("Please enter an even number or 999 to exit... ");
//
//            num = input.nextInt();
//
//            result = num % 2;
//
//        }
//    }
//}

