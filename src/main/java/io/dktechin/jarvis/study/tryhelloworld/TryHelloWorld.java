package io.dktechin.jarvis.study.tryhelloworld;

import java.util.*;

public class TryHelloWorld {
    public int getMinSum(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        int length = A.length;
        for ( int index = 0; index < length; index++ ) {
            answer += A[ index ] * B[ length - 1 - index ];
        }

        return answer;
    }

    public static void main(String[] args) {
        TryHelloWorld test = new TryHelloWorld();
        int[] A = { 1, 2 };
        int[] B = { 3, 4 };
        System.out.println(test.getMinSum(A, B));
    }
}