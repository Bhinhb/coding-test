package GPT;

import java.util.List;
import java.util.stream.Collectors;

//  문제 설명
//  문자열 리스트 words가 주어질 때,
//  각 단어의 길이만을 모은 리스트를 반환하세요.
//  입력: ["hi", "gpt", "빈"]
//  출력: [2, 3, 1]

public class 문자열의_길이_리스트_만들기 {
    public static List<Integer> getWordLengths(List<String> words) {
        return words.stream().map(s -> s.length()).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Integer> answer = getWordLengths(List.of("hi", "gpt", "빈"));
        System.out.println(answer);

    }
}
