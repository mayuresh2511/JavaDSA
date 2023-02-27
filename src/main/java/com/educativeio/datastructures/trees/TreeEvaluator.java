package com.educativeio.datastructures.trees;

import com.educativeio.datastructures.trees.binarySearchTree.BinarySearchTree;
import com.educativeio.datastructures.trees.binarySearchTree.Type;

public class TreeEvaluator {

  public static void main(String[] args) {

    BinarySearchTree binarySearchTree = new BinarySearchTree();

    binarySearchTree.insertInBinarySearchTree(6, Type.ITERATIVE);
    binarySearchTree.insertInBinarySearchTree(4, Type.ITERATIVE);
    binarySearchTree.insertInBinarySearchTree(9, Type.ITERATIVE);
    binarySearchTree.insertInBinarySearchTree(5, Type.ITERATIVE);
    binarySearchTree.insertInBinarySearchTree(2, Type.ITERATIVE);
    binarySearchTree.insertInBinarySearchTree(8, Type.ITERATIVE);
    binarySearchTree.insertInBinarySearchTree(12, Type.ITERATIVE);
    binarySearchTree.insertInBinarySearchTree(10, Type.ITERATIVE);
    binarySearchTree.insertInBinarySearchTree(14, Type.ITERATIVE);
    binarySearchTree.printTree();
    System.out.println();
    System.out.println(binarySearchTree.searchInBinaryTree(14, Type.ITERATIVE));
    System.out.println(binarySearchTree.searchInBinaryTree(15, Type.ITERATIVE));
    binarySearchTree.deleteInBinaryTreeRecursive(9);
    binarySearchTree.printTree();

  }
}
