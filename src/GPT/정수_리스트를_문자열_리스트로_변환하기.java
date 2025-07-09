package GPT;

import java.util.List;
import java.util.stream.Collectors;

//  문제 설명
//  정수 리스트 numbers가 주어질 때,
//  각 숫자를 문자열로 바꿔서 리스트에 담아 반환하세요.
//  입력: [1, 2, 3, 100]
//  출력: ["1", "2", "3", "100"]

public class 정수_리스트를_문자열_리스트로_변환하기 {
    public static List<String> convertToStringList(List<Integer> numbers) {
        return numbers.stream().map(n -> String.valueOf(n)).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> answer = convertToStringList(List.of(1, 2, 3, 100));
        System.out.println(answer);
    }
}
