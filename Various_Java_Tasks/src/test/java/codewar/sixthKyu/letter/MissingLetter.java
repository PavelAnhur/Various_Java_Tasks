package codewar.sixthKyu.letter;

import java.util.ArrayList;
import java.util.List;

public class MissingLetter {

    public static char findMissingLetter(char[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char firstLetter = array[0];
        char lastLetter = array[array.length - 1];
        System.out.println("first codewar.sixthKyu.letter: " + firstLetter + " and last codewar.sixthKyu.letter: " + lastLetter);
        char[] chars = alphabet.toCharArray();
        List<Character> alphabetPart = getAlphabetPart(firstLetter, lastLetter, chars);
        System.out.println(alphabetPart);
        return getMissingChar(array, alphabetPart);
    }

    private static char getMissingChar(char[] array, List<Character> alphabetPart) {
        for (int i = 0; i < alphabetPart.size(); i++) {
            if (!alphabetPart.get(i).equals(array[i])) {
                return alphabetPart.get(i);
            }
        }
        return ' ';
    }

    private static List<Character> getAlphabetPart(char firstLetter, char lastLetter, char[] chars) {
        List<Character> alphabetPart = new ArrayList<>();
        boolean rightLetter = false;
        for (char aChar : chars) {
            if (aChar == firstLetter) {
                rightLetter = true;
            }
            if (aChar == lastLetter) {
                alphabetPart.add(aChar);
                rightLetter = false;
            }
            if (rightLetter) {
                alphabetPart.add(aChar);
            }
        }
        return alphabetPart;
    }

    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L'}));
    }
}
