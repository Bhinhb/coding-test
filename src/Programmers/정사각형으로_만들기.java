package Programmers;

import java.util.Arrays;

//  문제 설명
//  이차원 정수 배열 arr이 매개변수로 주어집니다.
//  arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고,
//  열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
public class 정사각형으로_만들기 {
    public int[][] solution(int[][] arr) {
        if (arr.length > arr[0].length) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Arrays.copyOf(arr[i], arr.length);
            }
        } else if (arr.length < arr[0].length) {
            int[][] newArr = new int[arr[0].length][arr[0].length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = Arrays.copyOf(arr[i], arr[i].length);
            }
            arr = newArr;
        }
        return arr;
    }

    public int[][] solution2(int[][] arr) {
        int max = Math.max(arr[0].length, arr.length);
        int[][] newArr = new int[max][max];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Arrays.copyOf(arr[i], max);
        }
        return newArr;
    }
}
