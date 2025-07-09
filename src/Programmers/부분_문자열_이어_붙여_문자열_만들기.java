package Programmers;

//  문제 설명
//  길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다.
//  parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다.
//  각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

public class 부분_문자열_이어_붙여_문자열_만들기 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];

            answer.append(my_strings[i], s, e+1);

        }
        return answer.toString();
    }
}
