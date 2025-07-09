package GPT;

import java.util.List;
import java.util.stream.Collectors;

//  문제 설명
//  문자열 리스트 words가 주어질 때,
//  모든 문자열을 대문자로 변환한 리스트를 반환하세요.
//  입력: ["java", "stream", "rocks"]
//  출력: ["JAVA", "STREAM", "ROCKS"]

public class 소문자를_전부_대문자로_변환하기 {
    public static List<String> toUpperCaseAll(List<String> words) {
        return words.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> answer = toUpperCaseAll(List.of("java", "stream", "rocks"));
        System.out.println(answer);
    }
}
