package Array;

import java.util.Arrays;

public class ArrayShiftBoth {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayShiftBoth(new int[] {1,2,3,4,5})));
        System.out.println(Arrays.toString(arrayShiftBoth(new int[] {1,2,3,4,5}, "right")));
    }

    static int[] arrayShiftBoth(int[] arr) {
        int len = arr.length - 1;
        int end = arr[len];

            int i = len;
            while (i > 0) {
                arr[i] = arr[i-1];
                i--;
            }
            arr[0] = end;
        return  arr;
    }
    static int[] arrayShiftBoth(int[] arr,  String direction) {
        int len = arr.length - 1;
        int start = arr[0];

            int i = 0;
            while (i < len) {
                arr[i] = arr[i+1];
                i++;
            }
            arr[len] = start;
        return  arr;
    }
}
