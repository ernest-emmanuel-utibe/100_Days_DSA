package day_5;

public class ReverseString {
    public static String[] strings(String[] sentences) {
        String s = " ";
        for (int i = 0; i < sentences.length; i++) {
            s += sentences[i];
        }
        return s.split(" ");
    }
}
