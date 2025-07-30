package Programmers.기초_문제;


//  문제 설명
//  문자들이 담겨있는 배열 arr가 주어집니다.
//  arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

public class 문자_리스트를_문자열로_변환하기 {
    public static String solution(String[] arr) {
        String answer = "";
        for (String s : arr) {
            answer += s;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}));
    }
}
