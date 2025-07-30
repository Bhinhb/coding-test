package Programmers.기초_문제;

import java.time.LocalDate;
import java.util.Arrays;

//  문제 설명
//  정수 배열 date1과 date2가 주어집니다. 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다.
//  각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
//  만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
public class 날짜_비교하기 {

    //  배열 인덱스 값 비교
    public int solution(int[] date1, int[] date2) {
        for (int i = 0; i < 3; i++) {
            if (date1[i] < date2[i]) return 1;
            else if (date1[i] > date2[i]) return 0;
        }
        return 0;
    }
    //  compare 함수 사용해서 크기 비교
    public int solution2(int[] date1, int[] date2) {
        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
    }

    //  LocalDate 함수 사용 해서 비교 Java 9 이상
    public int solution3(int[] date1, int[] date2) {
        LocalDate d1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate d2 = LocalDate.of(date2[0], date2[1], date2[2]);
        return d1.isBefore(d2) ? 1 : 0;
    }
}
