package Programmers.기초_문제;

//  문제 설명
//  문자열 my_string과 정수 s, e가 매개변수로 주어질 때,
//  my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
public class 문자열_뒤집기 {
    public String solution(String my_string, int s, int e) {
        char[] answer = my_string.toCharArray();

        while (s < e) {
            char temp = answer[s];
            answer[s] = answer[e];
            answer[e] = temp;
            s++;
            e--;
        }
        return new String(answer);
    }
}
