package com.javacourse;

public class TaxReturn {
    int ssn;
    String firstname;
    String lastname;
    String street_address;
    String city;
    String state;
    int zipcode;
    int annual_income;
    String marital_status;
    int tax_liability;

    public TaxReturn(int ssn, String firstname, String lastname, String street_address,
                     String city, String state, int zipcode,
                     int annual_income, String marital_status, int tax_liability) {
        this.ssn = ssn;
        this.firstname = firstname;
        this.lastname = lastname;
        this.street_address = street_address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.annual_income = annual_income;
        this.marital_status = marital_status;
        this.tax_liability = tax_liability;
    }

    public void display () {
        System.out.println(ssn + " " + lastname + " " + firstname + " " + street_address +
                " " + city + " " + state + " " + zipcode + " " + annual_income + " " + marital_status + " " + tax_liability);
    }
}
