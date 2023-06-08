package day_4;

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

        for (int j : arr1) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }

        for (int j : arr2) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }

        int[] maxMin = new int[2];
        maxMin[0] = max;
        maxMin[1] = min;

        return maxMin;

    }
}
