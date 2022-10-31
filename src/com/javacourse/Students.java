package com.javacourse;

public class Students {
    double grade;
    int id;
    int no_of_credithrs;
    int points;

    public Students() {
        id = 14;
        points = 70;
        no_of_credithrs = 3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNo_of_credithrs() {
        return no_of_credithrs;
    }

    public void setNo_of_credithrs(int no_of_credithrs) {
        this.no_of_credithrs = no_of_credithrs;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void computegpa() {
        grade = points / no_of_credithrs;
        System.out.println(grade);
    }

    public void displayValue() {
        System.out.println("Student value includes" + " " + id + " " + no_of_credithrs + " " + points);
    }
}

//    public Students() {
//        grade = 'A';
//        id = 7789;
//        no_of_credithrs = 3;
//        points = 12;
//    }
