package day_5;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest{
    @Test
    void testReverseString() {
        String input = "Hello, World!";
        String expectedOutput = "!dlroW ,olleH";

        String reversed = ReverseString.reverseString(input);
        assertEquals(expectedOutput, reversed);
    }

}