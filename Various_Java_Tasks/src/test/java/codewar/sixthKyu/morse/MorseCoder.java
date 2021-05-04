package codewar.sixthKyu.morse;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MorseCoder {
    private static final Map<String, String> MORSE_ALPHABET = new HashMap<>();
    private static final Pattern CHAR_SPLIT = Pattern.compile("\\s");

    static {
        MORSE_ALPHABET.put("", " ");
        MORSE_ALPHABET.put(".-", "A");
        MORSE_ALPHABET.put("-...", "B");
        MORSE_ALPHABET.put("-.-.", "C");
        MORSE_ALPHABET.put("-..", "D");
        MORSE_ALPHABET.put(".", "E");
        MORSE_ALPHABET.put("..-.", "F");
        MORSE_ALPHABET.put("--.", "G");
        MORSE_ALPHABET.put("....", "H");
        MORSE_ALPHABET.put("..", "I");
        MORSE_ALPHABET.put(".---", "J");
        MORSE_ALPHABET.put("-.-", "K");
        MORSE_ALPHABET.put(".-..", "L");
        MORSE_ALPHABET.put("--", "M");
        MORSE_ALPHABET.put("-.", "N");
        MORSE_ALPHABET.put("---", "O");
        MORSE_ALPHABET.put(".--.", "P");
        MORSE_ALPHABET.put("--.-", "Q");
        MORSE_ALPHABET.put(".-.", "R");
        MORSE_ALPHABET.put("...", "S");
        MORSE_ALPHABET.put("-", "T");
        MORSE_ALPHABET.put("..-", "U");
        MORSE_ALPHABET.put("...-", "V");
        MORSE_ALPHABET.put(".--", "W");
        MORSE_ALPHABET.put("-..-", "X");
        MORSE_ALPHABET.put("-.--", "Y");
        MORSE_ALPHABET.put("--..", "Z");
        MORSE_ALPHABET.put("-----", "0");
        MORSE_ALPHABET.put(".----", "1");
        MORSE_ALPHABET.put("..---", "2");
        MORSE_ALPHABET.put("...--", "3");
        MORSE_ALPHABET.put("....-", "4");
        MORSE_ALPHABET.put(".....", "5");
        MORSE_ALPHABET.put("-....", "6");
        MORSE_ALPHABET.put("--...", "7");
        MORSE_ALPHABET.put("---..", "8");
        MORSE_ALPHABET.put("----.", "9");
        MORSE_ALPHABET.put("-.-.--", "!");
        MORSE_ALPHABET.put(".-.-.-", ".");
        MORSE_ALPHABET.put("...---...", "SOS");
    }

    public static String decode(String morseCode) {
        return CHAR_SPLIT.splitAsStream(morseCode)
                       .map(MORSE_ALPHABET::get)
                       .collect(Collectors.joining(""))
                       .replaceAll("\\s{2,}", " ")
                       .trim();
    }

    public static void main(String[] args) {
        System.out.println(MorseCoder.decode("-.-. --- -.. .  .-. . ...- .. . .--"));
        System.out.println(MorseCoder.decode(" ... --- ... "));
        System.out.println(MorseCoder.decode(" .-.-.-"));
    }
}
