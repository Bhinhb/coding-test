package Programmers;

//  문제 설명

//  최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때,
//  앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//  마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.

public class 다섯명씩 {
    public static String[] solution(String[] names) {
        int count = (int) Math.ceil(names.length / 5.0);
        String[] answer = new String[count];
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                answer[i/5] = names[i];
            }
        }
        return answer;
    }
}
