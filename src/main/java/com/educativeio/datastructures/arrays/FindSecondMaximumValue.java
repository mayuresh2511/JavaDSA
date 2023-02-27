package com.educativeio.datastructures.arrays;

public class FindSecondMaximumValue {

  public static int findSecondMaximumValue(int[] array){

    int maximumNumber = Integer.MIN_VALUE;
    int secondMaxNumber = Integer.MIN_VALUE;

    for (int i = 0; i < array.length; i++){

      if (array[i] > maximumNumber){
        maximumNumber = array[i];
      }
    }

    for (int i = 0; i < array.length; i++){

      if (array[i] < maximumNumber && array[i] > secondMaxNumber){
        secondMaxNumber = array[i];
      }
    }
    return secondMaxNumber;
  }

  public static int findSecondMaxValSingleTraverse(int[] array){

    int maximumNumber = Integer.MIN_VALUE;
    int secondMaxNumber = 0;

    for (int i = 0; i < array.length; i++){

      if (array[i] > maximumNumber){
        secondMaxNumber = maximumNumber;
        maximumNumber = array[i];
      }else if (array[i] > secondMaxNumber && array[i] < maximumNumber){
        secondMaxNumber = array[i];
      }
    }

    return secondMaxNumber;
  }
}
