package Programmers.입문_문제;

//  문제 설명
//  정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
//  num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
public class 배열_뒤집기 {
    public int[] solution(int[] num_list) {
        for (int i = 0; i < num_list.length / 2; i++) {
            int temp = num_list[i];
            num_list[i] = num_list[num_list.length - 1 -i];
            num_list[num_list.length - 1 -i] = temp;
        }
        return num_list;
    }
}
