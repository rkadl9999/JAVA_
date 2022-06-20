package org.example;

public class Extends {
    //상속
    //자식 클래스가 부모 클래스의 기능을 그대로 물려받을 때
    //extends 키워드를 사용
    public static class Dog extends OOP_Basic.Animal{ //OOP_Basic.java 파일에 있는 Animal 클래스를 상속 받은 Dog 클래스 생성
        public void cry(){
            System.out.println(getName()+" : 멍멍!");
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy"); //위 Dog 클래스에서는 setName이라는 메소드가 없는데도 상속 받았기 때문에 사용가능.
        System.out.println(dog.getName()); //위와 마찬가지
        dog.cry(); //상속 받고, 또 자신만의 메소드를 생성해서 사용할 수 있다. ( 부모 클래스는 사용 불가 )
    }

    //메소드 오버라이딩 ( Method overriding )
    //부모 클래스와 자식 클래스가 동일한 형태의 메소드를 가지고 있다면, 자식 클래스의 메소드가 더 높은 우선순위를 가지게 된다.

    //메소드 오버로딩 ( Method overloading )
    //메소드 이름이 동일하고, 받는 인자값이 다를 경우 가능하다.
    //다중 상속은 자바에서 지원하지 않는다.
}
