package Programmers;

import java.util.Scanner;

//  문제 설명
//  영어 알파벳으로 이루어진 문자열 str이 주어집니다.
//  각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

public class 대소문자_바꿔서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        //  한 번 생성된 String 객체는 내용이 바뀌지 않습니다.
        //  그래서 "abc" + "def"처럼 문자열을 이어붙이면, 내부적으로 새로운 문자열 객체가 매번 만들어집니다.
        //  → 문자열을 자주 바꾸면 메모리와 처리 시간이 낭비됩니다.
        //  StringBuilder 를 사용하면 문자열을 더 효과적으로 처리할 수 있음
        //  멀티스레드 환경에서 여러 스레드가 동시에 문자열을 수정할 가능성이 있을 때
        //  StringBuffer 추천, 단일 스레드 또는 동기화 필요 없으면 StringBuilder 권장
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else {
                answer.append(Character.toUpperCase(c));
            }
        }
        System.out.println(answer);
    }
}
