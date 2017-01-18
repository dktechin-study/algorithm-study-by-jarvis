package io.dktechin.jarvis.study.tree;

public class BinaryTree<T extends Comparable<T>> {

    private TreeNode<T> head;

    public void add(T value) {
        head = add(head, value);
    }

    protected TreeNode<T> add(TreeNode node, T value) {
        if ( node == null ) {
            return new TreeNode<>(value);
        }
        if ( node.value.compareTo(value) > 0 ) {
            node.left = add(node.left, value);
        } else {
            node.right = add(node.right, value);
        }

        return node;
    }

    public int size() {
        return count(head);
    }

    protected int count(TreeNode<T> node) {
        int count = 0;
        if ( node == null ) {
            return 0;
        }
        count++;
        count += count(node.left);
        count += count(node.right);

        return count;
    }

    public void remove() {

    }

    public void order(TreeVisitor<T> visitor) {
        visitor.visit(head);
    }

}
