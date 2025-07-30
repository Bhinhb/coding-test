package Programmers.기초_문제;

//  문제 설명
//  문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
//  my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

public class 글자_이어_붙여_문자열_만들기 {
    public StringBuilder solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < index_list.length; i++) {
            char c = my_string.charAt(index_list[i]);
            answer.append(c);
        }
        return answer;
    }
}
