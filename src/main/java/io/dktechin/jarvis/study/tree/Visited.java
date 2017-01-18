package io.dktechin.jarvis.study.tree;

public interface Visited<T extends Comparable<T>> {

    void doAction(T t);
}
