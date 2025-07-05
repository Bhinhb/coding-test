package Programmers;

//  문제 설명

//  정수가 담긴 리스트 num_list가 주어질 때,
//  리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.

public class 길이에_따른_연산 {
    public static void main(String[] args) {

        int[] num_list2 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int[] num_list = {2, 3, 4, 5};
        int answer;

        if (num_list.length >= 11) {
            answer = 0;
            for (int i=0; i<num_list.length; i++) {
                answer += num_list[i];
            }
        } else {
            answer = 1;
            for (int i=0; i<num_list.length; i++) {
                answer *= num_list[i];
            }
        }
        System.out.println(answer);
    }
}
