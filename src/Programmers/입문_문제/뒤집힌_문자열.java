package Programmers.입문_문제;

//  문제 설명
//  문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
public class 뒤집힌_문자열 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = my_string.length()-1; i > 0; i--) {
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }

    //  reverse 함수 있는거 알았으면 이렇게 했지ㅡㅡ
    public String solution2(String my_string) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string);
        answer.reverse();
        return answer.toString();
    }
}
