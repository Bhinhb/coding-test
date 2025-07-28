package Programmers;

//  문제 설명
//  정수 배열 arr이 매개변수로 주어집니다.
//  arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
//  arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
public class 배열의_길이를_2의_거듭제곱으로_만들기 {
    public int[] solution(int[] arr) {
        if ((arr.length & arr.length - 1) == 0) return arr;
        int anslen = 1;
        while (anslen < arr.length) {
            anslen *= 2;
        }
        int[] answer = new int[anslen];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }
}
