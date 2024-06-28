package Array;

import java.util.Arrays;

/*
* Input : A[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
Output : -1 1 2 3 4 -1 6 -1 -1 9
* */
public class ReArrangeArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reArrangeArray(new int[]{1, 4, 3, -1, 2, -5,})) + " === " +Arrays.toString(new int[]{-1, 1, 2, 3, 4, 5}));
//        reArrangeArray(new int[]{1, 4, 3, -1, 2, -5,});
    }

    static int[] reArrangeArray(int[] arr) {
        int n = arr.length - 1;
        for(int i = 0; i < n; i++){
            if(arr[i] < 0 || arr[i] == i)
                continue;

            int temp = arr[arr[i]];
//            System.out.println(arr[arr[i]] + " , " + arr[i]);
            arr[arr[i]] = arr[i];
            arr[i] = temp;

            i--;
        }

        return arr;
    }
}
