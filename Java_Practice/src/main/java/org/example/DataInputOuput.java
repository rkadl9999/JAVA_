package org.example;

import java.util.Scanner;

public class DataInputOuput {
    public static void main(String[] args) {
        //데이터 출력
        System.out.println("Hello world!"); //데이터 출력 후, 개행
        System.out.print("Hello world!"); //데이터 출력.

        //데이터 입력
        Scanner sc = new Scanner(System.in); //Scanner 객체 생성 ( sc )
        String name = sc.next(); //name 변수에 값 저장
        int age = sc.nextInt(); //age 변수에 값 저장
        System.out.println("이름 : "+name+" 나이 : "+age); //입력 받은 값 출력


    }
}