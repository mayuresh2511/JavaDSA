package com.educativeio.datastructures.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList<T> {

  //Node inner class for SLL
  public class Node {
    public T data;
    public Node nextNode;

  }

  public Node headNode; //head node of the linked list
  public int size;      //size of the linked list

  //Constructor - initializes headNode and size
  public SinglyLinkedList() {
    headNode = null;
    size = 0;
  }

  //Helper Function that checks if List is empty or not
  public boolean isEmpty() {
    if (headNode == null) return true;
    return false;
  }

  //Inserts new data at the start of the linked list
  public void insertAtHead(T data) {
    //Creating a new node and assigning it the new data value
    Node newNode = new Node();
    newNode.data = data;
    //Linking head to the newNode's nextNode
    newNode.nextNode = headNode;
    headNode = newNode;
    size++;
  }

  // Helper Function to printList
  public void printList() {
    if (isEmpty()) {
      System.out.println("List is Empty!");
      return;
    }

    Node temp = headNode;
    System.out.print("List : ");
    while (temp.nextNode != null) {
      System.out.print(temp.data.toString() + " -> ");
      temp = temp.nextNode;
    }
    System.out.println(temp.data.toString() + " -> null");
  }

  public void insertAtEnd(T data) {

    if (isEmpty()) {
      insertAtHead(data);
      return;
    }

    Node currNode = headNode;
    while (currNode.nextNode != null){
      currNode = currNode.nextNode;
    }

    Node newNode = new Node();
    newNode.data = data;
    newNode.nextNode = null;
    currNode.nextNode = newNode;
  }

  public void insertAfter(T data, T previous){

    Node currNode = headNode;
    while (currNode.data != previous){
      currNode = currNode.nextNode;
    }

    Node existingNode = currNode.nextNode;

    Node newNode = new Node();
    newNode.data = data;
    newNode.nextNode = existingNode;
    currNode.nextNode = newNode;

  }

  public boolean searchElement(T element){

    if (isEmpty()){
      return false;
    }

    Node currentNode = headNode;

    while (currentNode != null){

      if (currentNode.data == element){
        return true;
      }

      currentNode = currentNode.nextNode;
    }

    return false;
  }

  public void deleteByValue(T data){

    if (isEmpty()){
      return;
    }

    Node currentNode = headNode;
    Node previousNode = null;

    while (currentNode.nextNode != null){

      if (currentNode.data == data){
        break;
      }

      previousNode = currentNode;
      currentNode = currentNode.nextNode;
    }

    previousNode.nextNode = currentNode.nextNode;
  }

  public int findMiddleNode(){

    Node currentNode = headNode;
    Node trailingPointer = currentNode;
    Node leadingPointer = currentNode;

    while (leadingPointer.nextNode != null && leadingPointer.nextNode.nextNode != null){

      trailingPointer = trailingPointer.nextNode;
      leadingPointer = leadingPointer.nextNode.nextNode;

    }

    return (Integer) trailingPointer.data;
  }

  public void removeDuplicate(){

    Node currentNode = headNode;
    Node previousNode = null;
    List<T> uniqueElements = new ArrayList<>();

    while (currentNode != null){

      if (!uniqueElements.contains(currentNode.data)){
        previousNode = currentNode;
        uniqueElements.add(currentNode.data);
      }else{
        previousNode.nextNode = currentNode.nextNode;
      }
      currentNode = currentNode.nextNode;
    }

  }
}
