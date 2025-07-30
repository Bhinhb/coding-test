package Programmers.기초_문제;

//  문제 설명

//  양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//  단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
public class 더_크게_합치기 {
    public static int solution(int a, int b) {
        int ab = Integer.parseInt("" + a + b);
        int ba = Integer.parseInt("" + b + a);

        return ab >= ba ? ab : ba;
    }
    public static void main(String[] args) {
        int result1 = solution(12, 34);
        int result2 = solution(90, 12);
        int result3 = solution(1, 1);

        System.out.println("12와 34 중 더 큰 결합값: " + result1); // 3412
        System.out.println("90과 12 중 더 큰 결합값: " + result2); // 9012
        System.out.println("1과 1 중 더 큰 결합값: " + result3);   // 11
    }
}
