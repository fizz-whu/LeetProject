package leet.fb.general;
import java.util.*;
import java.lang.*;

public class Leet283MoveZeroes {

  public void moveZeroes(int[] nums) {

    int j = 0;
    for(int i = 0; i < nums.length; ++i) {
      if(nums[i] != 0) {
        nums[j++] = nums[i];
      }
    }
    for(int i = j; i < nums.length; ++i) {
      nums[i] = 0;
    }

  }

}
