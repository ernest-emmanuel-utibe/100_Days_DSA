package day_5;

public class ReverseString {
//    public static String[] strings(String[] sentences) {
//        String s = " ";
//        for (int i = 0; i < sentences.length; i++) {
//            s += sentences[i];
//        }
//        return s.split(" ");
//    }

    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    }
}
