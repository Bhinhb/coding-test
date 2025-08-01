package Programmers.입문_문제;

//  문제 설명
//  문자열 my_string과 정수 n이 매개변수로 주어질 때,
//  my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
public class 문자_반복_출력하기 {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            for (int j = 0; j < n; j++) {
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
