package org.example;

public class ControlFlowStatement {
    public static void main(String[] args) {
        //if문
        //조건이 true면 if문, false면 else문 실행
        //else if문 | 다중 조건문

        //Example Code
        int age = 20; //age 변수에 나이 값 저장

        if (age < 20){ //age가 20 미만일 때
            System.out.println("미성년자 입니다.");
        }
        else { //age가 20 이상일 때
            System.out.println("성인 입니다.");
        }

        //Switch-Case 문
        //변수의 값에 따라 해당 코드 실행

        //Example Code
        char input = 'A';
        switch (input){
            case 'A':
                System.out.println("A를 입력하셨습니다.");
                break;
            case 'B':
                System.out.println("B를 입력하셨습니다.");
                break;
            default:
                System.out.println("A, B 외의 다른 값을 입력하셨습니다.");
                break;
        }

        //while | 반복문
        //break | while문 빠져나가기
        //continue | 첫줄로 돌아가기

        //Example Code
        int i = 0;

        while(i < 100){ //i를 100까지 만드는 반복문
            i++;
            }
        System.out.println("i : "+i); //반복문이 끝난 후, i의 값

        //for문 | 반복문

        //Example Code
        int j = 0;
        for(int cnt = 1; cnt <= 100; cnt++){ //1부터 100까지 더하는 반복문
            j += cnt;
        }
        System.out.println("j : "+j); //반복문이 끝난 뒤 j의 값 출력 | 5050

        //for-each문

        //Example Code
        int[] a = {1,2,3,4,5};
        int sum = 0;
        for(int tmp : a){ //배열에서 순차적으로 하나씩 꺼내와서 tmp 변수에 저장 후 아래 코드 실행
            sum += tmp;
        }
        System.out.println("sum : "+sum); //반복문이 끝난 뒤 sum의 값 출력 | 15
        
        }
    }
