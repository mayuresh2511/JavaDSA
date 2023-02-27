package com.educativeio.datastructures.linkedlist;

public class LinkedListEvaluator {

  public static void main(String[] args) {

    SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
    linkedList.insertAtHead(2);
    linkedList.insertAtHead(0);
    linkedList.insertAtHead(1);
    linkedList.insertAtHead(0);

    linkedList.insertAtEnd(3);

    linkedList.insertAtEnd(0);

    linkedList.insertAtEnd(2);
//    linkedList.insertAtEnd(4);

//    linkedList.printList();
//    linkedList.insertAfter(5, 1);

//    System.out.println(linkedList.searchElement(5));

//    linkedList.deleteByValue(3);

    linkedList.printList();

    System.out.println(linkedList.findMiddleNode());

    linkedList.removeDuplicate();

    linkedList.printList();
  }
}
