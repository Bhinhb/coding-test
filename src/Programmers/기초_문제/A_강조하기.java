package Programmers.기초_문제;


//  문제 설명
//  문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고,
//  "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
public class A_강조하기 {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'a' || c == 'A') {
                answer.append('A');
            } else if (c >= 'B' && c  <= 'Z') {
                answer.append(Character.toLowerCase(c));
            } else answer.append(c);
        }
        return answer.toString();
    }

    //  초간단 방법
    public String solution2(String myString) {
        return myString.toLowerCase().replaceAll("a", "A");
    }
}
