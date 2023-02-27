package com.educativeio.datastructures.arrays;

public class ArrayOfProducts {

  public static int[] arrayOfProductsOfElementsExceptItselfBruteForce(int[] array){

    int[] resultArray = new int[array.length];
    int multiplyNumbers;

    for (int i = 0; i < array.length; i++){
      multiplyNumbers = 1;
      for (int j = 0; j < array.length; j++){

        if (i != j){
          multiplyNumbers *= array[j];
        }
      }
      resultArray[i] = multiplyNumbers;
    }
    return resultArray;
  }

}
