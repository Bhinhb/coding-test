package Programmers;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


//  문제 설명
//  정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은
//  기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
public class 배열의_원소_삭제하기 {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = Arrays.stream(delete_list)
                .boxed()
                .collect(Collectors.toSet());

        return Arrays.stream(arr)
                .filter(num -> !deleteSet.contains(num))            // 시간복잡도 O(n + m)
                .toArray();
    }

    public int[] solution2(int[] arr, int[] delete_list) {
        return IntStream.of(arr)
                .filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i))                     // 시간복잡도 O(n * m)
                .toArray();
    }
}
