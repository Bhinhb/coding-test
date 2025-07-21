package Programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

//  문제 설명
//  정수 배열 arr와 2개의 구간이 담긴 배열 intervals가 주어집니다.
//  intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며 각 구간은 닫힌 구간입니다.
//  닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미합니다.
//  이때 배열 arr의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을 앞뒤로 붙여 새로운 배열을 만들어 return 하는 solution 함수를 완성해 주세요.
public class 배열_만들기_3 {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];

        int[] parts1 = Arrays.copyOfRange(arr, a1, b1+1);
        int[] parts2 = Arrays.copyOfRange(arr, a2, b2+1);

        return IntStream.concat(Arrays.stream(parts1), Arrays.stream(parts2)).toArray();
    }
}
