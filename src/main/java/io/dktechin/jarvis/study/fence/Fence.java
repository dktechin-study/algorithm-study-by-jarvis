package io.dktechin.jarvis.study.fence;

import java.util.ArrayList;
import java.util.List;

public class Fence {

    private List<Integer> solve(double[] xi, double[] hi) {
        if ( xi.length != hi.length ) {
            throw new IllegalArgumentException("x와 h 길이가 다릅니다.");
        }

        int[] course = new int[ xi.length ];
        Double[] degree = new Double[ xi.length ];

        for ( int i = 0; i < course.length; i++ ) {
            course[ i ] = -1;
        }

        double maxDegree;
        double d;
        int maxIndex;

        int index = 0;
        while ( index < xi.length ) {
            maxDegree = -99999;
            maxIndex = Integer.MAX_VALUE;
            for ( int target = index + 1; target < xi.length; target++ ) {
                d = degree(index, target, xi, hi);
                if ( maxDegree < d ) {
                    maxDegree = d;
                    maxIndex = target;
                }
            }
            if ( maxIndex != Integer.MAX_VALUE ) {
                 course[ maxIndex ] = index;
                degree[ maxIndex ] = maxDegree;
            }
            index = maxIndex;
        }

        List<Integer> courses = new ArrayList<>();
        for ( int idx = 0; idx < course.length; idx++ ) {
            if ( course[ idx ] >= 0 ) {
                courses.add(course[ idx ]);
            }
        }
        courses.add(course.length - 1);

        return courses;
    }

    private Double degree(int index, int target, double[] xi, double[] hi) {
        return (hi[ target ] - hi[ index ]) / (xi[ target ] - xi[ index ]);
    }

    public static final void main(String[] args) {
        Fence fence = new Fence();
        double[] xi = new double[] { 3, 6, 8, 12, 17, 20, 26, 28, 32 };
        double[] hi = new double[] { 10, 5, 13, 6, 4, 10, 17, 14, 4 };
        List<Integer> course = fence.solve(xi, hi);
        for ( Integer index : course ) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}
