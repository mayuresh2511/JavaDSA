package com.educativeio.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class CheckRemoveEven {

  public static int[] removeEven(int[] array){

    int[] prevArray = null;
    int[] resultArray = null;
    int count = 0;

    for (int number : array) {

      if (number % 2 != 0) {
        count++;
        resultArray = new int[count];


        if (count == 1) {
          resultArray[0] = number;
        } else {
          System.arraycopy(prevArray, 0, resultArray, 0, count - 1);
          resultArray[count - 1] = number;
        }

        prevArray = resultArray;
      }
    }
    return resultArray;
  }

  public static int[] removeEvenPath2(int[] array){

    int oddNumberCount = 0;

    for (int number : array) {

      if (number % 2 != 0) {
        oddNumberCount++;
      }
    }
    int[] resultOddArray = new int[oddNumberCount];
    int resultIndex = 0;

    for (int oddNumber : array){
      if (oddNumber%2 != 0){
        resultOddArray[resultIndex++] = oddNumber;
      }
    }

    return null;
  }

  public static int[] removeEvenUsingListAndStream(int[] array){

    List<Integer> intermediateResultList = new ArrayList<>();

    for (int number : array){
      if (number%2 != 0){
        intermediateResultList.add(number);
      }
    }

    int[] resultArray = intermediateResultList.stream().mapToInt(number -> number).toArray();

    return resultArray;
  }

}
