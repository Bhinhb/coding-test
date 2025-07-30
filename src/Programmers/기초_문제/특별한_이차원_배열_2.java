package Programmers.기초_문제;


//  문제 설명
//  n × n 크기의 이차원 배열 arr이 매개변수로 주어질 때, arr이 다음을 만족하면 1을 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
//  0 ≤ i, j < n인 정수 i, j에 대하여 arr[i][j] = arr[j][i]
public class 특별한_이차원_배열_2 {
    public int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                return arr[i][j] != arr[j][i] ? 0 : 1;
            }
        }
        return 1;
    }
}
