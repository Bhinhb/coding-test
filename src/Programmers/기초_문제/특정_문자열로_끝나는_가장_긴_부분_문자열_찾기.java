package Programmers.기초_문제;


//  문제 설명
//  문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
public class 특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {
    public String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}
