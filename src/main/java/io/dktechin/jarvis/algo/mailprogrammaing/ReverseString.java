package io.dktechin.jarvis.algo.mailprogrammaing;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * 주어진 string 에 모든 단어를 거꾸로 하시오.
 *
 * 예제)
 * Input: “abc 123 apple”
 * Output: “cba 321 elppa”
 */
public class ReverseString {

    public static String reverse(String str) {
        String[] strings = str.split(" ");
         Stream.Builder<String> builder = Stream.builder();
        for (String string : strings) {
            char[] characters = string.toCharArray();
            char[] reverseChars = new char[characters.length];
            for (int i = characters.length; i > 0 ; i--) {
                reverseChars[ characters.length - i ] = characters[i - 1];
            }
            builder.add(new String(reverseChars));
        }

        return builder.build()
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(reverse("한글 abc 123 apple"));
    }

}
