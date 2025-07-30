package Programmers.기초_문제;

import java.util.LinkedList;
import java.util.Stack;
//  문제 설명
//  정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.
//  변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
//  만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
//  stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
//  stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
//  위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.

public class 배열_만들기_4 {
    public int[] solution(int[] arr) {
        LinkedList<Integer> stk = new LinkedList<>();
        for (int i = 0; i < arr.length;) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (stk.getLast() < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else {
                stk.removeLast();
            }
        }
        int[] result = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            result[j] = stk.get(j);
        }
        return result;
    }

    //  더 효율적인 풀이
    //  Stack 기억할 것
    public int[] solution2(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int i : arr) {
            while (!stk.isEmpty() && i <= stk.peek())
                stk.pop();
            stk.push(i);
        }
        return stk.stream().mapToInt(i -> i).toArray();
    }
}
