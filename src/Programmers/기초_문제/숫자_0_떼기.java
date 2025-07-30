package Programmers.기초_문제;


//  문제 설명
//  정수로 이루어진 문자열 n_str이 주어질 때,
//  n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
public class 숫자_0_떼기 {
    public String solution(String n_str) {
        return n_str.replaceFirst("^0+", "");       // 정규식을 활용한 방법
    }

    public String solution2(String n_str) {
        return "" + Integer.parseInt(n_str);            // int 형으로 변환하면 앞의 0은 다 날아감
    }
}
