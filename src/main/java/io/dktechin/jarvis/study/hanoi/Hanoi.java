package io.dktechin.jarvis.study.hanoi;

public class Hanoi {

    public int run(int n, int a, int b) {
        if ( n <= 0 ) {
            return 0;
        }

        process(a, b);

        if ( n == 1 ) {
            return 1;
        }

        return 1
                + run(n - 1, a, b % 3 + 1)
                + run(n - 1, a % 3 + 1, b % 3 + 1);
    }


    private void process(int a, int b) {
        System.out.println(a + "에서 " + b + "로 이동");
    }

    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        int count = hanoi.run(4, 1, 2);
        System.out.println("이동 횟수 : " + count);
    }
}
