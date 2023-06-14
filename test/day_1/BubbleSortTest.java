package day_1;

import day_1.BubbleSort;

class BubbleSortTest {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] array = {5, 1, 2, 3, 4};
        BubbleSort.bubbleSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}