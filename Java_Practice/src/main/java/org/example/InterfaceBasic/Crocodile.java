package org.example.InterfaceBasic;

public class Crocodile extends Animal implements Predator{
    public Crocodile(String name) {
        super(name);
    }

    public String getFood(){
        return "chicken";
    }

    public String getName(){
        return super.name;
    }
}
