package leet.fb.general;

import org.junit.Test;
import static org.junit.Assert.*;

public class Leet283MoveZeroesTest {

  @Test
  public void batchTest() {
    Leet283MoveZeroes testClass = new Leet283MoveZeroes();
    
    int[] arr1 = {0, 0, 0};
    int[] arr1c = {0, 0, 0};
    int[] arr2 = {1, 0, 0};
    int[] arr2c = {1, 0, 0};
    int[] arr3 = {1, 0, 1};
    int[] arr3c = {1, 1, 0};
    int[] arr4 = {1, 1, 1};
    int[] arr4c = {1, 1, 1};
    int[] arr5 = {0, 1, 1};
    int[] arr5c = {1, 1, 0};
    int[] arr6 = {};
    int[] arr6c = {};

    testClass.moveZeroes(arr1);
    testClass.moveZeroes(arr2);
    testClass.moveZeroes(arr3);
    testClass.moveZeroes(arr4);
    testClass.moveZeroes(arr5);
    testClass.moveZeroes(arr6);
    assertArrayEquals(arr1, arr1c);
    assertArrayEquals(arr2, arr2c);
    assertArrayEquals(arr3, arr3c);
    assertArrayEquals(arr4, arr4c);
    assertArrayEquals(arr5, arr5c);
    assertArrayEquals(arr6, arr6c);

  }
}
