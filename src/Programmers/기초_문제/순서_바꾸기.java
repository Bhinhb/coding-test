package Programmers.기초_문제;

//  문제 설명
//  정수 리스트 num_list와 정수 n이 주어질 때,
//  num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을
//  n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.

public class 순서_바꾸기 {
    public static int[] solution(int[] num_list, int n) {

        // 새로운 배열 생성
        int length = num_list.length;
        int[] answer = new int[length];

        // n번째 이후 원소를 앞에 삽입
        for (int i = n; i<length; i++) {
            answer[i-n] = num_list[i];
        }

        // n번째 이전 원소를 뒤에 삽입
        for (int i = 0; i<n; i++) {
            answer[length-n+i] = num_list[i];

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int[] result = solution(num_list, 1);
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }
}
