package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8})));
    }

    static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
