package Programmers.입문_문제;

//  문제 설명
//  정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.
public class 두_수의_나눗셈 {
    public int solution(int num1, int num2) {
        double answer = (double) num1 / num2;
        return  (int) (answer * 1000);
    }

    //  리얼 신박한 풀이
    public int solution2(int num1, int num2) {
        return num1 * 1000 / num2;
    }
}
