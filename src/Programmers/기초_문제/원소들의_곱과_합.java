package Programmers.기초_문제;


//  문제 설명
//  정수가 담긴 리스트 num_list가 주어질 때,
//  모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.

import java.util.stream.IntStream;

public class 원소들의_곱과_합 {
    public int solution(int[] num_list) {
        int sum = IntStream.of(num_list).sum();
        int product = IntStream.of(num_list).reduce(1, (a, b) -> a * b);
        return sum * sum > product ? 1 : 0;
    }
}
