package Programmers;

//  문제 설명
//  문자열 my_string과 정수 n이 매개변수로 주어질 때,
//  my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.

public class 문자열의_앞의_n글자 {
    public static String solution(String my_string, int n) {
        return my_string.substring(0 ,n);
    }
}
