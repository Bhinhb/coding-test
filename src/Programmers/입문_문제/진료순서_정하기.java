package Programmers.입문_문제;


import java.util.Arrays;
import java.util.stream.IntStream;

//  문제 설명
//  외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
//  정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
public class 진료순서_정하기 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sorted = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sorted);

        //  내림차순 정렬
        for (int i = 0; i < emergency.length/2; i++) {
            int temp = sorted[i];
            sorted[i] = sorted[emergency.length-i-1];
            sorted[emergency.length-i-1] = temp;
        }

        //  순위 매기기
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < sorted.length; j++) {
                if (emergency[i] == sorted[j]) {
                    answer[i] = j + 1;
                }
            }
        }
        return answer;
    }
}
