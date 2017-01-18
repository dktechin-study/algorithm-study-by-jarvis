package io.dktechin.jarvis.study.tree;

public interface TreeVisitor<T extends Comparable<T>> {

    void visit(TreeNode<T> node);
}
