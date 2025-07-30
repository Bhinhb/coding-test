package Programmers.기초_문제;


//  문제 설명
//  문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
public class 문자열이_몇번_등장하는지_세기 {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = 0;

        while ((index = myString.indexOf(pat, index)) != -1) {
            answer++;
            index++;
        }
        return answer;
    }
}
