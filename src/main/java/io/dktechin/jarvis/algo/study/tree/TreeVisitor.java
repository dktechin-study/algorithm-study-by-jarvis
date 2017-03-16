package io.dktechin.jarvis.algo.study.tree;

public interface TreeVisitor<T extends Comparable<T>> {

    void visit(TreeNode<T> node);
}
