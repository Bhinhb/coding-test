package Programmers;

import java.util.Arrays;

//  문제 설명
//  한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
public class 문자열_정수의_합 {
    public int solution(String num_str) {
        return Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).sum();
    }
}
