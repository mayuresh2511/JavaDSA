package com.educativeio.datastructures.stacksqueues;

public class TwoStacks<V> {

  private int top1;
  private int top2;
  private int max_size;
  private V[] array;

  public TwoStacks(int max_size){

    this.max_size = max_size;
    this.top1 = -2;
    this.top2 = -1;
    this.array = (V[]) new Object[max_size];

  }

  public boolean is_stack1_empty(){
    if (top1 == -2) return true;
    return false;
  }

  public boolean is_stack2_empty(){
    if (top2 == -1) return true;
    return false;
  }

  public void push1(V value){

    if ((top1 + 2) < max_size){
      array[top1 + 2] = value;
      top1 += 2;
      return;
    }

    System.out.println("No more space in stack 1");
  }

  public void push2(V value){

    if ((top2 + 2) < max_size){
      array[top2 + 2] = value;
      top2 += 2;
      return;
    }

    System.out.println("No more space in stack 2");

  }

  public V pop1(){

    if (is_stack1_empty()) return null;

    V element = array[top1];
    array[top1] = null;
    top1 -= 2;
    return element;
  }

  public V pop2(){

    if (is_stack2_empty()) return null;

    V element = array[top2];
    array[top2] = null;
    top2 -= 2;
    return element;

  }
}

