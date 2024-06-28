package leetcode;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));
    }
    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] result = new int[len*2];
        for (int i = 0; i < len; i++) {
            result[i]= result[i+len] = nums[i];
        }
        return result;
    }
}
