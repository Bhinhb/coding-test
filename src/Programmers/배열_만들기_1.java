package Programmers;

//  문제 설명
//  정수 n과 k가 주어졌을 때,
//  1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

public class 배열_만들기_1 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for (int i = 0; i < n/k; i++ ) {
            answer[i] = k*(i+1);
        }
        return answer;
    }
}
