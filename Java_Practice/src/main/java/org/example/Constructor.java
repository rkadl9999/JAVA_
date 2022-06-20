package org.example;

public class Constructor {
    //생성자
    //인스턴스가 생성될 때마다 호출되는 인스턴스 초기화 메소드
    //이름이 클래스 이름과 같아야 한다.
    //리턴값이 없다.
    private String name;
    private int age;
    public Constructor(String name){ //생성자
        setName(name);
    }

    public Constructor(int age){ //생성자 오버로딩 | 입력 타입이 달라야함
        this.age = age;
    }

    public String getName() { //Getter
        return name;
    }

    public void setName(String name) { //Setter
        this.name = name;
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor("Hyeonuk"); //객체 생성과 동시에 생성자 불러오기
        System.out.println(constructor.getName()); //Hyeonuk

        Constructor overloading = new Constructor(18); //오버로딩된 생성자 불러오기
        System.out.println(overloading.age); //18
    }
}
