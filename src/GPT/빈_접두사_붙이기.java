package GPT;

import java.util.List;
import java.util.stream.Collectors;

//  문제 설명
//  이름 리스트 names가 주어질 때,
//  각 이름 앞에 "빈: "이라는 접두어를 붙여 리스트로 반환하세요.
//  입력: ["지수", "철수", "영희"]
//  출력: ["빈: 지수", "빈: 철수", "빈: 영희"]

public class 빈_접두사_붙이기 {
    public static List<String> prefixWithBin(List<String> names) {
        return names.stream().map(s -> "빈 : " + s).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> answer = prefixWithBin(List.of("지수", "철수", "영희"));
        System.out.println(answer);
    }
}