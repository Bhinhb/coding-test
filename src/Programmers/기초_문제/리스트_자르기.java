package Programmers.기초_문제;

import java.util.Arrays;

//  문제 설명
//  정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다.
//  slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
//  n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
//  n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
//  n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
//  n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
//  올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
public class 리스트_자르기 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        switch (n) {
            case 1:
                return Arrays.copyOfRange(num_list, 0, slicer[1]+1);
            case 2:
                return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3:
                return Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
            case 4:
                int[] result = new int[(slicer[1]-slicer[0])/slicer[2]+1];
                for (int i = 0, idx = slicer[0]; idx <= slicer[1]; i++, idx+=slicer[2]) {
                    result[i] = num_list[idx];
                }
                return result;
        }
        return new int[0];
    }
}
