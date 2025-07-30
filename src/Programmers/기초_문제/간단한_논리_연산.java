package Programmers.기초_문제;

//  문제 설명
//  boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
//  (x1 ∨ x2) ∧ (x3 ∨ x4)
//  ∨과 ∧의 진리표는 다음과 같습니다.        v = or, ^ = and
//  x	y	x ∨ y	x ∧ y
//  T	T	  T	      T
//  T	F	  T	      F
//  F	T	  T	      F
//  F	F	  F       F
public class 간단한_논리_연산 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
}
