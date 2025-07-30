package Programmers.입문_문제;

import java.util.Arrays;

//  문제 설명
//  정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
public class 배열의_평균값 {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
