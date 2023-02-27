package com.educativeio.datastructures.hashtable;

import java.util.HashMap;

public class HashTableEvaluator {

  public static void main(String[] args) {

//    int[] array1 = new int[]{9,4,7,1,-2,6,5};
//    int[] array2 = new int[]{7,1,-2};
//
//    System.out.println(isSubset(array1, array2));

    int[][] array = new int[][]{{1, 2}, {3, 4}, {5, 9}, {4, 3}, {9, 5}};
    System.out.println(findSymmetricPairs(array));
  }

  public static boolean isSubset(int[] array1, int[] array2){

    HashMap<Integer, Integer> numberCountMap = new HashMap<>();

    for (int i = 0; i < array1.length; i++){

      if (numberCountMap.containsKey(array1[i])){
        numberCountMap.put(array1[i], numberCountMap.get(array1[i]) + 1);
      }else{
        numberCountMap.put(array1[i], 1);
      }
    }

    System.out.println(numberCountMap.toString());

    for (int j = 0; j < array2.length; j++){

      if (numberCountMap.containsKey(array2[j])){

        if (numberCountMap.get(array2[j]) != 0){
          numberCountMap.put(array2[j], numberCountMap.get(array2[j]) - 1);
        }else{
          return false;
        }

      }else{
        return false;
      }
    }

    return true;
  }

  public static String findSymmetricPairs(int [][]array1){

    HashMap<Integer, Integer> intermediateMap = new HashMap<>();
    String result = "";
    for (int i = 0; i < array1.length; i++){

      if (!intermediateMap.containsKey(array1[i][1])){
        intermediateMap.put(array1[i][0], array1[i][1]);
      }else{
        if (intermediateMap.get(array1[i][1]) == array1[i][0]){
          result = result + "{" + array1[i][1] + "," + array1[i][0] + "} ";
        }
      }
    }

    return result;
  }
}
