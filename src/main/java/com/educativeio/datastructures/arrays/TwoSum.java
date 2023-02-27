package com.educativeio.datastructures.arrays;

import java.util.HashMap;

public class TwoSum {

  public static int[] twoSumUsingHashMap(int[] array, int result){

    int[] resultArray = new int[2];

    HashMap<Integer, Integer> intermediateMap = new HashMap<>();

    for (int number : array){

      if (intermediateMap.containsKey(result - number)){
        resultArray[0] = number;
        resultArray[1] = result - number;
        return resultArray;
      }else {
        intermediateMap.put(number, result - number);
      }
    }

    return resultArray;
  }
}
