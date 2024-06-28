package Array;

import java.util.Arrays;

/**
 * Rotate Array
 * 1,2,3 -> 3,2,1
 * */

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int len = arr.length - 1;
        int i = len;
        int temp = arr[len];
        while (i >= 0) {
            System.out.println(i);
            if(i == 0) {
                arr[0] = temp;
                break;
            }
            arr[i] = arr[i-1];
            i--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
