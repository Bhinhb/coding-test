package GPT;

import java.util.List;

//  문제 설명
//  정수 리스트 numbers가 주어집니다.
//  각 원소를 제곱한 값들로 이루어진 새로운 리스트를 만들어 return하는 함수를 작성하세요.
//  입력: [1, 2, 3, 4, 5]
//  출력: [1, 4, 9, 16, 25]

public class 정수_리스트_제곱하기 {
    public List<Integer> squareAll(List<Integer> numbers) {
        return numbers.stream().map(n -> n*n).toList();
    }
}
