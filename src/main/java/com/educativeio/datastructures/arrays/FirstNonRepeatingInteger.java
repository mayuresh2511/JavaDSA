package com.educativeio.datastructures.arrays;

import java.util.ArrayList;

public class FirstNonRepeatingInteger {

  public static int findFirstNonRepeatingBruteForce(int[] array){

    boolean uniqueFlag = false;

    for (int i = 0; i < array.length; i++){

      uniqueFlag = true;

      for (int j = 0; j < array.length; j++){

        if(array[i] == array[j] && i != j){
          uniqueFlag = false;
          break;
        }

      }

      if (uniqueFlag){
        return array[i];
      }
    }
    return -1;
  }

}
