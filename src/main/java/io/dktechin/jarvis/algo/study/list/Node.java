package io.dktechin.jarvis.algo.study.list;

public class Node<T> {

    T value;

    Node next;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }

}
