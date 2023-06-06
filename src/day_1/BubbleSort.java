package day_1;

public class BubbleSort {
    public static void bubbleSort(int[] sequence) {
        int number = sequence.length;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - 1 - i; j++) {
                if (sequence[j] > sequence[j + 1]) {
                    int temporary = sequence[j];
                    sequence[j] = sequence[j + 1];
                    sequence[j + 1] = temporary;
                }
            }
        }
    }
}
