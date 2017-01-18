package io.dktechin.jarvis.study;

import io.dktechin.jarvis.study.tree.*;
import org.junit.Assert;
import org.junit.Test;

public class TreeTest {

    @Test
    public void addTest() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(5);
        binaryTree.add(3);
        binaryTree.add(4);
        binaryTree.add(2);

        Assert.assertEquals(4, binaryTree.size());

        PrintAction<Integer> action = new PrintAction<>();

        System.out.print("Pre order : ");
        binaryTree.order(new PreOrderVisitor<>(action));
        System.out.println();

        System.out.print("In order : ");
        binaryTree.order(new InOrderVisitor<>(action));
        System.out.println();

        System.out.print("Post order : ");
        binaryTree.order(new PostOrderVisitor<>(action));
        System.out.println();
    }
}
