package com.company;

public class Customer extends Score {
    private Gender gender;
    private String hair;

    public Customer(int age, String name, Tradable tradable, Gender gender, String hair) {
        super(age, name, tradable);
        this.gender = gender;
        this.hair = hair;
    }

    public Gender getGender() {
        return gender;
    }

    public String getHair() {
        return "Hair " + hair;
    }

    public void magaz() {
        System.out.println("Идет в магазин: " + getName());
    }

    public void magaz(int call) {
        call = 20;
        System.out.println("Идет в магазин: " + getName() + " " + call + " лет");
    }

    public String getInfo() {
        return "\nGender: " + gender;
    }
}
