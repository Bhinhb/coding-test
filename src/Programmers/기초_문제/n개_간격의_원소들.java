package Programmers.기초_문제;

import java.util.stream.IntStream;

//  문제 설명
//  정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
public class n개_간격의_원소들 {
    public int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length)
                .filter(i -> i%n==0)
                .map(i -> num_list[i])
                .toArray();
    }
}
