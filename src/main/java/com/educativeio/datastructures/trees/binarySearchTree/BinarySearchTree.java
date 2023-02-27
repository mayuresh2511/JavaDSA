package com.educativeio.datastructures.trees.binarySearchTree;

public class BinarySearchTree {

  private Node rootNode;

  public BinarySearchTree(Integer data){
    this.rootNode = new Node(data);
  }

  public BinarySearchTree() {

  }

  public void insertInBinarySearchTree(Integer data, Type insertionType){
    if (insertionType == Type.ITERATIVE){
      insertInBinarySearchTreeIterative(data, this.rootNode);
    }else {
      rootNode = insertInBinarySearchTreeRecursive(data, this.rootNode);
    }
  }

  private Node insertInBinarySearchTreeRecursive(Integer data, Node rootNode){

    if (rootNode == null){
      return new Node(data);
    }

    if (data < rootNode.getData()){
     rootNode.setLeftNode(insertInBinarySearchTreeRecursive(data, rootNode.getLeftNode()));
    }else{
      rootNode.setRightNode(insertInBinarySearchTreeRecursive(data, rootNode.getRightNode()));
    }

    return rootNode;
  }

  private void insertInBinarySearchTreeIterative(Integer data, Node rootNode){

    if (rootNode == null){
      this.rootNode = new Node(data);
      return;
    }

    Node currNode = rootNode;

    while (currNode != null){

      Node leftNode = currNode.getLeftNode();
      Node rightNode = currNode.getRightNode();

      if (data < currNode.getData()){
        if (leftNode == null) {
          leftNode = new Node(data);
          currNode.setLeftNode(leftNode);
          return;
        }
        currNode = leftNode;
      }else {
        if (rightNode == null) {
          rightNode = new Node(data);
          currNode.setRightNode(rightNode);
          return;
        }
        currNode = rightNode;
      }

    }

    return;
  }

  public Boolean searchInBinaryTree(Integer data, Type searchType){
    if (searchType == Type.RECURSIVE){
      return searchInBinaryTreeRecursive(data, this.rootNode);
    }else {
      return searchInBinaryTreeIterative(data, this.rootNode);
    }
  }

  private Boolean searchInBinaryTreeRecursive(Integer data, Node rootNode){

    if (rootNode == null){
      return false;
    }

    if (data == rootNode.getData()){

      return true;
    }

    if (data < rootNode.getData()){
      return searchInBinaryTreeRecursive(data, rootNode.getLeftNode());
    }else {
      return searchInBinaryTreeRecursive(data, rootNode.getRightNode());
    }

  }

  public Boolean searchInBinaryTreeIterative(Integer data, Node rootNode){

    if (data == rootNode.getData()){
      return true;
    }

    Node currNode = rootNode;

    while( currNode != null){

      Node leftNode = currNode.getLeftNode();
      Node rightNode = currNode.getRightNode();

      if (currNode.getData() < data){
        if (rightNode == null){
          return false;
        }
        if (rightNode.getData() == data){
          return true;
        }else{
          currNode = rightNode;
        }
      }else{
        if (leftNode == null){
          return false;
        }
        if (leftNode.getData() == data){
          return true;
        }else{
          currNode = leftNode;
        }
      }
    }
    return false;
  }

  public void deleteInBinaryTreeRecursive(Integer data){
    deleteInBinaryTreeRecursive(data, null, this.rootNode);
  }
  private void deleteInBinaryTreeRecursive(Integer data, Node parenNode, Node rootNode){

    if (rootNode == null){
      return;
    }

    if (data == rootNode.getData()){
      parenNode.setRightNode(swapNodesOfBinaryTree(rootNode, rootNode.getRightNode()));
      return;
    }

    if (data < rootNode.getData()){
       deleteInBinaryTreeRecursive(data, rootNode, rootNode.getLeftNode());
    }else {
       deleteInBinaryTreeRecursive(data, rootNode, rootNode.getRightNode());
    }
    return;
  }

  private Node swapNodesOfBinaryTree(Node rootNode, Node rightNode) {

    if (rightNode == null){
      return null;
    }

    rightNode.setRightNode(swapNodesOfBinaryTree(rightNode, rightNode.getRightNode()));
    rightNode.setLeftNode(rootNode.getLeftNode());

    return rightNode;
  }

  public void printTree(){
    printTree(this.rootNode);
  }

  private void printTree(Node current)
  {
    if (current == null) return;

    System.out.print(current.getData() + ",");
    printTree(current.getLeftNode());
    printTree(current.getRightNode());

  }
}

class Node{

  private Integer data;
  private Node leftNode;
  private Node rightNode;

  public Node(Integer data) {
    this.data = data;
    this.leftNode = null;
    this.rightNode = null;
  }

  public Integer getData() {
    return data;
  }

  public void setData(Integer data) {
    this.data = data;
  }

  public Node getLeftNode() {
    return leftNode;
  }

  public void setLeftNode(Node leftNode) {
    this.leftNode = leftNode;
  }

  public Node getRightNode() {
    return rightNode;
  }

  public void setRightNode(Node rightNode) {
    this.rightNode = rightNode;
  }
}