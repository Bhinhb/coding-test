package Programmers;

//  문제 설명
//  길이가 같은 두 문자열 str1과 str2가 주어집니다.
//  두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서
//  한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

public class 문자열_섞기 {
    public static String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";

        System.out.println(solution(str1, str2));
    }
}
