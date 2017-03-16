package io.dktechin.jarvis.algo.acmicpc.a1697;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 문제 : 숨바꼭질
 * BFS로 풀기
 *
 * 문제 출처 : https://www.acmicpc.net/problem/1697
 */
public class HideAndSeek {

    public int solve(int x, int k) {
        Queue<Integer> queue = new LinkedList<>();
        final int max = k * 2;
        final int min = 0;

        int length = max;
        boolean[] visited = new boolean[ length ];
        int[] counts = new int[ length ];

        queue.add(x);
        visited[ x ] = true;

        while ( !queue.isEmpty() && !visited[ k ] ) {
            int position = queue.poll();

            if ( position - 1 > min && !visited[ position - 1 ] ) {
                move(position, position - 1, visited, counts, queue);
            }

            if ( position + 1 < max && !visited[ position + 1 ] ) {
                move(position, position + 1, visited, counts, queue);
            }

            if ( position * 2 < max && !visited[ position * 2 ]) {
                move(position, position * 2, visited, counts, queue);
            }
        }

        return counts[ k ];
    }

    private static void move(int position, int to, boolean[] visited, int[] counts, Queue<Integer> queue) {
        counts[ to ] = counts[ position ] + 1;
        visited[ to ] = true;
        queue.add(to);
    }

    public static void main(String[] args) {
        HideAndSeek hideAndSeek = new HideAndSeek();
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(hideAndSeek.solve(x, y));
        
    }

}
