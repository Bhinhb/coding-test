package Programmers;

//  문제 설명

//  정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//  만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 배열_만들기_2 {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        //  LinkedList는 Queue, Stack 등의 대표적인 리스트
        Queue<String> queue = new LinkedList<>();

        //  l, r이 정수이기 때문에 시작은 무조건 "5"로 시작
        //  offer << Queue에 값 넣기
        queue.offer("5");

        while (!queue.isEmpty()) {
            String current = queue.poll();  //  Queue에서 값 꺼내기
            int num = Integer.parseInt(current);
            if (num > r) continue;
            if (num >= l) result.add(num);

            queue.offer(current + "0");
            queue.offer(current + "5");
        }
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
