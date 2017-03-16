package io.dktechin.jarvis.algo.study.tree;

public class PrintAction<T extends Comparable<T>> implements Visited<T> {
    @Override
    public void doAction(T t) {
        System.out.print(t.toString() + "  ");
    }
}
