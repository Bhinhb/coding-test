package Programmers.기초_문제;

import java.math.BigInteger;

//  문제 설명
//  0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
public class 두_수의_합 {
    public String solution(String a, String b) {
        BigInteger bigA = new BigInteger(a), bigB = new BigInteger(b);
        return bigA.add(bigB).toString();
    }
}
