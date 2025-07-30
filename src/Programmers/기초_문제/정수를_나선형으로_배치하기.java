package Programmers.기초_문제;

//  문제 설명
//  양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를
//  인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
public class 정수를_나선형으로_배치하기 {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x = 0, y = 0, num = 1, dir = 0;

        while (num <= n * n) {
            answer[x][y] = num;
            num++;

            int nx = x + dx[dir], ny = y + dy[dir];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n || answer[nx][ny] != 0) {
                dir = (dir+1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            x = nx; y = ny;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] result = solution(5);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");  // 탭으로 예쁘게
            }
            System.out.println();
        }
    }
}
