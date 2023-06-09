package day_5;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringTest{

    public static void main(String[] args) {

        ReverseString test = new ReverseString();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a sequence of characters: ");
        String input = scanner.nextLine();

        System.out.println(Arrays.stream(input).collect(Collectors.toList()));
    }

}