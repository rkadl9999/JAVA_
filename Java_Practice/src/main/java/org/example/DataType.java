package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class DataType {
    public static void main(String[] args){
        //변수 : 값을 저장하기 위한 메모리 공간
        /*규칙
        - 변수명은 숫자로 시작 불가
        - _,$ 외에 다른 특수문자는 사용 불가
        - 예약어는 변수명으로 사용 불가
         */

        //숫자 자료형
        int intNum; //정수형, 0으로 시작하면 8진수, 0x로 시작하면 16진수로 판단.
        long longNum; //정수형
        float floatNum; //실수형
        double doubleNum; //실수형

        //Boolean
        boolean trueOrFalse; //참 또는 거짓의 값을 가진다. ( True or False )

        //문자 자료형
        char charA; //한개의 문자값을 저장할 땐 char 사용.
        String string; //문자열(문장)을 저장할 땐 String 사용.

        //Example Code
        String a = "Hello Java";
        System.out.println(a); //Hello Java
        System.out.println(a.indexOf("Java")); //6 | 문자열에서 특정 문자열이 시작되는 인덱스를 리턴
        System.out.println(a.replaceAll("Java", "World")); //Hello World | 특정 문자열을 다른 문자열로 바꿀 때 사용.
        System.out.println(a.substring(0,5)); //Hello | 문자열에서 특정 부분을 뽑아올 때 사용
        System.out.println(a.toLowerCase()); //hello java | 문자열을 모두 소문자로 변경.
        System.out.println(a.toUpperCase()); //HELLO JAVA | 문자열을 모두 대문자로 변경.

        //StringBuffer
        //문자열을 추가하거나 변경할 때 주로 사용하는 자료형
        //append | 문자열 추가, += 으로 추가함
        //toString() | String 자료형으로 변경
        //insert(위치, 넣을 문자) | 특정 위치에 원하는 문자열을 삽입

        //배열 ( Array )
        //같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간

        //List
        //리스트는 크기가 정해져있지 않고, 동적으로 변함
        //ArrayList | List 자료형 중 가장 간단한 형태의 자료형
        //add(값) | 값 추가
        //add(넣을 위치, 값) | 위치를 지정하여 값 추가
        //get(위치) | 위치에 해당하는 값을 가져옴
        //size() | ArrayList 개수 리턴
        //contains(값) | 리스트 안에 해당 값이 있는지 boolean 형으로 반환
        //remove(객체) | 리스트에서 객체에 해당하는 항목을 제거하고 결과를 boolean 형으로 반환
        //remove(인덱스) | 해당 인덱스의 항목을 제거한 후 제거된 항목 리턴

        //Example Code
        ArrayList<String> list = new ArrayList<String>(); //ArrayList 객체 생성
        list.add("첫번째 인덱스입니다."); //값 추가
        list.add("두번째 인덱스입니다.");
        list.add("세번째 인덱스입니다.");

        System.out.println(list.get(0)); //첫번째 인덱스입니다.
        System.out.println(list.size()); //3
        System.out.println(list.contains("첫번째 인덱스입니다.")); //true
        System.out.println(list.remove("세번째 인덱스입니다.")); //true
        System.out.println(list.size()); //2
        System.out.println(list.remove(0)); //첫번째 인덱스입니다.

        //맵(MAP)
        //Map은 리스트나 배열처럼 순차적으로 해당 요소 값을 구하지 않고, key를 통해 value를 얻는다.
        //put(key, value) | 메소드를 통해 key와 value를 입력한다.
        //get(key) | 해당 key에 해당하는 value값 리턴
        //containsKey(key) | 해당 key가 있는지 boolean 형으로 리턴
        //remove(key) | 해당 key에 해당하는 아이템(key, value) 삭제 후 그 value값을 리턴
        //size() | 맵의 개수 리턴

        //Example Code
        HashMap<String, String> map = new HashMap<>(); //Map 객체 생성
        map.put("people", "사람"); //값 추가
        map.put("soccer", "축구");

        System.out.println(map.get("people")); //사람
        System.out.println(map.containsKey("people")); //true
        System.out.println(map.remove("people")); //사람
        System.out.println(map.size()); //1
    }
}
