package Programmers.입문_문제;

//  문제 설명
//  문자열 my_string과 문자 letter이 매개변수로 주어집니다.
//  my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
public class 특정_문자_제거하기 {
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }

    public String solution2(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}
