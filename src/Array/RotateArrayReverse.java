package Array;

import java.util.Arrays;

/**
 * 1,2,3,4,5
 * 2,3,4,5,1
 * */

public class RotateArrayReverse {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5};
        int len = arr.length - 1;
        int temp = arr[0];
        int i = 0;

        while (i <= len) {
            if(i == len) {
                arr[i] = temp;
                break;
            }
            arr[i] = arr[i+1];
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
