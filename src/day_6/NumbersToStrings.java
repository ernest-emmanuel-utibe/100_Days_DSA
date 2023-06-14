package day_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersToStrings {
    public static List<String> numbersToStrings(List<Integer> numbers) {
        List<String> strings = new ArrayList<>();
        for (int number : numbers) {
            strings.add(String.valueOf(number));
        }
        return strings;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> strings = numbersToStrings(numbers);
        System.out.println(strings);
    }
}
