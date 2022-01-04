package com.company;

public class Order extends Customer{
    private String color;

    public Order(int age, String name, Tradable tradable, Gender gender, String chars, String color) {
        super(age, name, tradable, gender, chars);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
