package Programmers.기초_문제;

//  문제 설명
//  1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
//  네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
//  세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)² 점을 얻습니다.
//  주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
//  어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
//  네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
//  네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
public class 주사위_게임_3 {
    public int solution(int a, int b, int c, int d) {
        int[] dice = new int[7];
        dice[a]++;
        dice[b]++;
        dice[c]++;
        dice[d]++;

        // 모두 다 같은 경우
        for (int i = 1; i <= 6; i++) {
            if (dice[i] == 4) {
                return 1111 * i;
            }
        }

        // 세 개 같은 경우
        for (int i = 1; i <= 6; i++) {
            if (dice[i] == 3) {
                int p = i;
                for (int j = 1; j <= 6; j++) {
                    if (dice[j] == 1) return (int) Math.pow(10 * p + j, 2);
                }
            }
        }


        // 2 + 2 경우
        int[] pairs = new int[2];
        int idx = 0;
        for (int i = 1; i <= 6; i++) {
            if (dice[i] == 2) {
                pairs[idx++] = i;
            }
        }
        if (idx == 2) {
            return (pairs[0] + pairs[1]) * Math.abs(pairs[0] - pairs[1]);
        }


        // 2 + 1 + 1 경우
        int pair = 0;
        int[] singles = new int[2];
        idx = 0;
        for (int i = 1; i <= 6; i++) {
            if (dice[i] == 2) pair = i;
            else if (dice[i] == 1 && idx < 2) singles[idx++] = i;
        }
        if (pair != 0 && idx == 2) {
            return singles[0] * singles[1];
        }

        // 모두 다른 경우
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}
