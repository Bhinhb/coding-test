package Programmers.입문_문제;

import java.util.Arrays;

//  문제 설명
//  정수 배열 numbers가 매개변수로 주어집니다.
//  numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
public class 최댓값_만들기_1 {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (answer < numbers[i] * numbers[j]) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }
    //  정렬해서 제일 큰 것 두개 곱하기
    public int solution2(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] & numbers[numbers.length-2];
    }
}
