package codewar.sixthKyu.order;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class OrderWord {

    public static String order(String words) {
        if (words.equals("")) {
            return "";
        } else {
            String[] sortedStringArray = getSortedArray(getStrings(words));
            return String.join(" ", sortedStringArray);
        }
    }

    private static String[] getSortedArray(String[] words) {
        boolean sorted = false;
        String temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < words.length - 1; i++) {
                if (getNumberFromString(words[i]) > getNumberFromString(words[i + 1])) {
                    temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return words;
    }

    private static int getNumberFromString(String word) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(word);
        if (matcher.find()) {
            return word.charAt(matcher.start());
        } else {
            return -1;
        }
    }

    private static String[] getStrings(String words) {
        return Stream.of(words).flatMap((st) -> Arrays.stream(st.split(" "))).toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(order("Fo1r 4of g3ood pe6ople the2 th5e"));
    }
}
