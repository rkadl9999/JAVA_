package org.example;

public class OOP_Basic {
    //객체 | 모든 인스턴스를 대표하는 일반적인 용어
    //인스턴스 | 특정 클래스로부터 생성된 객체
    public static class Animal{ //class | 설계도
        private String name;

        public void setName(String name) { //Setter | 클래스에 선언되어있는 뱐수에 값을 주입 ( 메소드 )
            this.name = name;
        }

        public String getName() { //Getter | 해당 인스턴스에 있는 값을 리턴 ( 메소드 )
            return name;
        }
    }

    public static void main(String[] args) {
        Animal cat = new Animal(); //cat이라는 객체 생성
        Animal dog = new Animal(); //dog라는 객체 생성

        cat.setName("고양이"); //Setter 이용하여 이름 설정
        dog.setName("강아지");

        System.out.println(cat.getName()); //Getter 이용하여 이름 가져오기 | 고양이
        System.out.println(dog.getName()); //강아지

        //클래스의 장점
        //각 객체마다 객체 변수의 값이 독립적으로 유지된다.
    }
}