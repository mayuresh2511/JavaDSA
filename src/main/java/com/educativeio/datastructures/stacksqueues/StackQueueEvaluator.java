package com.educativeio.datastructures.stacksqueues;

public class StackQueueEvaluator {

  public static void main(String[] args) {

//    String[] result = generateBinaryNumbersUsingQueue(5);
//
//    for (String str : result){
//      System.out.println(str);
//    }

//    TwoStacks<Integer> dualStack = new TwoStacks<>(5);

    QueueImpl<Integer> numberQueue = new QueueImpl<>(20);
    numberQueue.enqueue(1);
    numberQueue.enqueue(2);
    numberQueue.enqueue(3);
    numberQueue.enqueue(4);
    numberQueue.enqueue(5);
    numberQueue.enqueue(6);
    numberQueue.enqueue(7);
    numberQueue.enqueue(8);
    numberQueue.enqueue(9);
    numberQueue.enqueue(10);

    reverseQueue(numberQueue, 5);
    System.out.println("Top element of queue " + numberQueue.dequeue());
  }

  public static String[] generateBinaryNumbersUsingQueue(Integer number){

    String[] resulBinaryArray = new String[number];
    QueueImpl<String> queue = new QueueImpl<>(number + 1);

    queue.enqueue("1");

    for (int i = 0; i < number; i++){
      resulBinaryArray[i] = queue.dequeue();
      String s1 = resulBinaryArray[i] + "0";
      String s2 = resulBinaryArray[i] + "1";
      queue.enqueue(s1);
      queue.enqueue(s2);
    }

    return resulBinaryArray;
  }

  public static <V> void reverseQueue(QueueImpl<V> queue, int k){

    QueueImpl<V> tempQueue = new QueueImpl<>(20);
    StackImpl<V> tempStack = new StackImpl<>(20);
    int counter = 0;

    while (counter < 5){
      tempStack.push(queue.dequeue());
      counter++;
    }

    while (!queue.isEmpty()){
      tempQueue.enqueue(queue.dequeue());
    }

    while (!tempStack.isEmpty()){
      queue.enqueue(tempStack.pop());
    }

    while (!tempQueue.isEmpty()){
      queue.enqueue(tempQueue.dequeue());
    }

    return;
  }
}
