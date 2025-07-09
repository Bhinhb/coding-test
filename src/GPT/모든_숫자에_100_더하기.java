package GPT;

import java.util.List;
import java.util.stream.Collectors;

//  문제 설명
//  정수 리스트 numbers가 주어질 때,
//  각 숫자에 100을 더한 리스트를 반환하세요.
//  입력: [10, 20, 30]
//  출력: [110, 120, 130]

public class 모든_숫자에_100_더하기 {
    public static List<Integer> addHundred(List<Integer> numbers) {
        return numbers.stream().map(n -> n+100).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> answer = addHundred(List.of(10, 20, 30));

        System.out.println(answer);

    }
}
