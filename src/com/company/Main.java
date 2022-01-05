package com.company;

public class Main {

    public static void main(String[] args) {
        Customer objectA = new Customer(20, "Andrey", Tradable.JEANS, Gender.MAN, "brown");
        Score objectB = new Score(40, "Peter", Tradable.PANTS);
        Score objectC = new Score(33, "Alex", Tradable.SHIRT);
        System.out.println(objectA.getInfo());
        System.out.println(objectA.getHair());
        objectA.magaz();
        System.out.println("================");
        System.out.println(objectB.getInfo());;
        System.out.println("================");
        System.out.println(objectC.getInfo());;
        System.out.println("================");
    }
}
