package Programmers;

//  문제 설명

//  정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다.
//  그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.

public class 조건에_맞게_수열_변환하기_1 {

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};

        int[] result = solution(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
