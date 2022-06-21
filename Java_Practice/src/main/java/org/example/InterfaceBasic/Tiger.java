package org.example.InterfaceBasic;

public class Tiger extends Animal implements Predator{
    public Tiger(String name) {
        super(name);
    }

    public String getFood() {
        return "apple";
    }

    public String getName(){
        return super.name;
    }
}
