package io.dktechin.jarvis.algo.study.tree;

public class InOrderVisitor<T extends Comparable<T>> extends OrderVisitor {

    public InOrderVisitor(Visited action) {
        super(action);
    }

    @Override
    public void visit(TreeNode node) {
        if ( node != null ) {
            if ( node.left != null ) {
                visit(node.left);
            }
            action.doAction(node.value);
            if ( node.right != null ) {
                visit(node.right);
            }
        }
    }
}
