package io.dktechin.jarvis.algo.study.tree;

public class PostOrderVisitor<T extends Comparable<T>> extends OrderVisitor<T> {

    public PostOrderVisitor(Visited<T> action) {
        super(action);
    }

    @Override
    public void visit(TreeNode<T> node) {
        if ( node != null ) {
            if ( node.left != null ) {
                visit(node.left);
            }
            if ( node.right != null ) {
                visit(node.right);
            }
            action.doAction(node.value);
        }
    }
}
