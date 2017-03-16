package io.dktechin.jarvis.algo.study.tree;

public interface Visited<T extends Comparable<T>> {

    void doAction(T t);
}
