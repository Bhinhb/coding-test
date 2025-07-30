package Programmers.기초_문제;

//  문제 설명
//  정수 start_num와 end_num가 주어질 때,
//  start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

public class 카운트_다운 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        for (int i = start_num; i >= end_num; i--) {
            answer[start_num - i] = i;
        }
        return answer;
    }
}
