package Programmers.입문_문제;

import java.util.HashMap;
import java.util.Map;

//  문제 설명
//  머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
//  그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
//  문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
//  모스부호는 다음과 같습니다.
//
//  morse = {
//    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
//    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
//    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
//    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
//    '-.--':'y','--..':'z'
//  }
public class 모스_부호 {
    public String solution(String letter) {
        Map<String, String> morse = new HashMap<>();
        String[] morseCode = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."
        };
        for (int i = 0; i < morseCode.length; i++) {
            morse.put(morseCode[i], String.valueOf((char) ('a' + i)));
        }
        String[] codes = letter.split(" ");
        StringBuilder answer = new StringBuilder();

        for (String code : codes) {
            answer.append(morse.get(code));
        }
        return answer.toString();
    }
}
