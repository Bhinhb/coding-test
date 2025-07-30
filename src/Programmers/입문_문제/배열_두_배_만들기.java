package Programmers.입문_문제;

import java.util.Arrays;

//  문제 설명
//  정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
public class 배열_두_배_만들기 {
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }

    public int[] solution2(int[] numbers) {
        return Arrays.stream(numbers).map(i -> 2 * i).toArray();
    }
}
