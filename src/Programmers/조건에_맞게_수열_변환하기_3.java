package Programmers;


//  문제 설명
//  정수 배열 arr와 자연수 k가 주어집니다.
//  만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더합니다.
//  이러한 변환을 마친 후의 arr를 return 하는 solution 함수를 완성해 주세요.
public class 조건에_맞게_수열_변환하기_3 {
    public int[] solution(int[] arr, int k) {
        if (k % 2 == 0) {
            for (int i = 1; i < arr.length; i++) {
                arr[i] *= k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] += k;
            }
        }
        return arr;
    }

    public int[] solution2(int[] arr, int k) {
        boolean odd = (k % 2 == 1);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = odd ? arr[i]*k : arr[i] + k;
        }
        return arr;
    }
}
