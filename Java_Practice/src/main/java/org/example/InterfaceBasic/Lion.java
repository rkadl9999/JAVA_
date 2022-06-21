package org.example.InterfaceBasic;

public class Lion extends Animal implements Predator{
    public Lion(String name) {
        super(name);
    }

    public String getFood() {
        return "banana";
    }

    public String getName(){
        return super.name;
    }
}
