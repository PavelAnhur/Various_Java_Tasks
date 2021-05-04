package codewar.sixthKyu.mumbling;

public class Accumul {

    public static String accum(String string) {
        String[] stringLetters = string.split("");
        StringBuilder resultString = new StringBuilder();
        resultString.append(stringLetters[0].toUpperCase());
        for (int i = 1; i < stringLetters.length; i++) {
            String repeatedLetter = stringLetters[i].repeat(i + 1);
            resultString
                    .append("-")
                    .append(repeatedLetter.substring(0, 1).toUpperCase())
                    .append(repeatedLetter.substring(1).toLowerCase());
        }
        return String.valueOf(resultString);
    }
}