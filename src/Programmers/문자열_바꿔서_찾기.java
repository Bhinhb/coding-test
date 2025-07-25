package Programmers;


//  문제 설명
//  문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다.
//  myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
public class 문자열_바꿔서_찾기 {
    public static int solution(String myString, String pat) {
        String answer = myString.replace("A", "X")
                                .replace("B", "A")
                                .replace("X", "B");
        System.out.println(answer);
        return answer.contains(pat) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("ABBAA", "AABB"));
    }
}
