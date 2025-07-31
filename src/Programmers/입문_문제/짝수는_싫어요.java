package Programmers.입문_문제;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//  문제 설명
//  정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
public class 짝수는_싫어요 {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                answer[i/2] = i;
            }
        }
        return answer;
    }

    public int[] solution2(int n) {
        return IntStream.rangeClosed(0,n).filter(i -> i % 2 == 1).toArray();
    }
}
