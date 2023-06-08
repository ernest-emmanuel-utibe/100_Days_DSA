package day_4;

import java.util.Arrays;

public class MaxMin {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] maxMin = findMaxMin(arr1, arr2);

        System.out.println("Maximum: " + maxMin[0]);
        System.out.println("Minimum: " + maxMin[1]);
    }

    public static int[] findMaxMin(int[] arr1, int[] arr2) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr1.length; i++) {
            max = Math.max(max, arr1[i]);
            min = Math.min(min, arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            max = Math.max(max, arr2[i]);
            min = Math.min(min, arr2[i]);
        }

        int[] maxMin = new int[2];
        maxMin[0] = max;
        maxMin[1] = min;

        return maxMin;

    }
}
