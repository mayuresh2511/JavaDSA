package com.educativeio.datastructures.arrays;

public class MergeTwoSortedArrays {

  public static int[] mergeArrays(int[] array1, int[] array2){

    int[] mergedArray = new int[array1.length + array2.length];
    int array1Pointer = 0;
    int array2Pointer = 0;

    while (array1Pointer < array1.length || array2Pointer < array2.length){

      if ((array1Pointer < array1.length && array2Pointer < array2.length) &&
          (array1[array1Pointer] < array2[array2Pointer])){
        mergedArray[array1Pointer + array2Pointer] = array1[array1Pointer];
        array1Pointer++;
      }

      if ((array1Pointer < array1.length && array2Pointer < array2.length) &&
          (array2[array2Pointer] < array1[array1Pointer])){
        mergedArray[array1Pointer + array2Pointer] = array2[array2Pointer];
        array2Pointer++;
      }

      if (array1Pointer >= array1.length && array2Pointer < array2.length){
        mergedArray[array1Pointer + array2Pointer] = array2[array2Pointer];
        array2Pointer++;
      }

      if (array2Pointer >= array2.length && array1Pointer < array1.length){
        mergedArray[array1Pointer + array2Pointer] = array1[array1Pointer];
        array1Pointer++;
      }
    }

    return mergedArray;
  }
}
