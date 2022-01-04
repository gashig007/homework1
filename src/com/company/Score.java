package com.company;

public class Score {
    private int age;
    private String name;
    private Tradable tradable;

    public Score(int age, String name, Tradable tradable) {
        this.age = age;
        this.name = name;
        this.tradable = tradable;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Tradable getTradable() {
        return tradable;
    }

    public String getInfo(){
        return "Age: " + age + "\nName: " + name;
    }
}
