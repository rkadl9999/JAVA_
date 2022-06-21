package org.example.InterfaceBasic;

public class ZooKeeper {
    public void feed(Predator predator){
        System.out.println(predator.getName()+" feed "+predator.getFood());
    }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger("Tiger");
        Lion lion = new Lion("Lion");
        Crocodile crocodile = new Crocodile("Crocodile");

        zooKeeper.feed(lion);
        zooKeeper.feed(tiger);
        zooKeeper.feed(crocodile);
    }
}
