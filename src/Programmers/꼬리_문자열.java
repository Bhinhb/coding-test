package Programmers;


import java.util.Arrays;
import java.util.stream.Collectors;

//  문제 설명
//  문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 꼬리 문자열이라고 합니다.
//  꼬리 문자열을 만들 때 특정 문자열을 포함한 문자열은 제외시키려고 합니다.
//  예를 들어 문자열 리스트 ["abc", "def", "ghi"]가 있고 문자열 "ef"를 포함한 문자열은 제외하고 꼬리 문자열을 만들면 "abcghi"가 됩니다.
//  문자열 리스트 str_list와 제외하려는 문자열 ex가 주어질 때, str_list에서 ex를 포함한 문자열을 제외하고 만든 꼬리 문자열을 return하도록 solution 함수를 완성해주세요.
public class 꼬리_문자열 {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        for (String word : str_list) {
            if (word.contains(ex)) {
                continue;
            }
            answer.append(word);
        }
        return answer.toString();
    }

    //  Stream 써보기
    public String solution2(String[] str_list, String ex) {
        return Arrays.stream(str_list)
                .filter(s -> !s.contains(ex))
                .collect(Collectors.joining());
    }
}
