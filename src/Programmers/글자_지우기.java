package Programmers;

//  문제 설명
//  문자열 my_string과 정수 배열 indices가 주어질 때,
//  my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
public class 글자_지우기 {
    public String solution(String my_string, int[] indices) {
        boolean[] remove = new boolean[my_string.length()];
        for (int i : indices) {
            remove[i] = true;
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (!remove[i]) {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
}
