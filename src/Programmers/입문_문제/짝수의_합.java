package Programmers.입문_문제;

import java.util.Arrays;
import java.util.stream.IntStream;

//  문제 설명
//  정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
public class 짝수의_합 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }

    //  스트림은 정말 섹시하군
    public int solution2(int n) {
        return IntStream.range(0, n).filter(i -> i % 2 == 0).sum();
    }
}
