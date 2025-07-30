package Programmers.기초_문제;

import java.util.Arrays;

//  문제 설명
//  문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
public class 문자열_잘라서_정렬하기 {
    public static String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("dxccxxbbbxaaaa")));
    }
}
