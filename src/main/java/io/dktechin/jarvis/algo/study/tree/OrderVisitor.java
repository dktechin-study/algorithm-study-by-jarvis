package io.dktechin.jarvis.algo.study.tree;

public abstract class OrderVisitor<T extends Comparable<T>> implements TreeVisitor<T> {

    protected Visited<T> action;

    public OrderVisitor(Visited<T> action) {
        this.action = action;
    }

    @Override
    public abstract void visit(TreeNode<T> node);
}
