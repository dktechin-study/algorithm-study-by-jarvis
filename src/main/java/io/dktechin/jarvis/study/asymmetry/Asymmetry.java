package io.dktechin.jarvis.study.asymmetry;

import java.util.Arrays;

/**
 * output :
 * A B C D
 * B A D C
 * C D A B
 * D C B A
 *
 *  | ------------ |
 *  |   1   |   2   |
 *  | -----| ------|
 *  |   3  |    4  |
 *  | -----| -----|
 *
 * 나의 전략 : n값을 기준으로 반을 나눈다.3영역에선 2의 영역을 복사하고, 4의 영역에서 1의 영역을 복사한다.
 * 그런데 해당 영역이 초기에 크다면 분할하여 작은 것부터 처리한다. (사실 그냥 밑에서 부터 해도 될듯함...)
 *
 */

public class Asymmetry {

    public char[][] asymmetry(char... inputs) {
        int n = inputs.length;
        char[][] map = new char[ n ][];
        for ( int index = 0; index < n; index++ ) {
            map[ index ] = new char[ n ];
        }
        map[ 0 ] = Arrays.copyOf(inputs, inputs.length);

        asymmetry(map, n / 2, 0);

        return map;
    }

    public void asymmetry(char[][] map, int n, int x) {
        if ( n == 1 ) {
            return;
        }

        asymmetry(map, n / 2, x / 2);
//        copySquare(map);
        asymmetry(map, n / 2, x + n / 2);
    }

    private void copySquare(char[][] map, int n, int srcX, int destX) {
        int half = n / 2;
        int srcY = half - 1;
        srcX--;
        destX--;

        for ( int destY = n - 1; destY > half; destY--, srcY-- ) {
            System.arraycopy(map[ srcY ], srcX , map[ destY ], destX , half);
        }

    }
}
