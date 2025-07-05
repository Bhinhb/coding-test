package Programmers;

//  문제 설명
//  문자열 my_string과 정수 k가 주어질 때,
//  my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

public class 문자열_곱하기 {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
}
