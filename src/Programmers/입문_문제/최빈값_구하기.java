package Programmers.입문_문제;

//  문제 설명
//  최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
//  정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
public class 최빈값_구하기 {
    public int solution(int[] array) {
        int[] cnt = new int[1000];
        for (int num : array) {
            cnt[num]++;
        }
        int max = 0;
        int answer = -1;
        boolean duplicate = false;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                answer = i;
                duplicate = false;
            } else if (cnt[i] == max && max != 0) {
                duplicate = true;
            }
        }
        return duplicate ? -1 : answer;
    }
}
