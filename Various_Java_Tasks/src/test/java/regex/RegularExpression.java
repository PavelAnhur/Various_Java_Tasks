package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public int getCountOfWord(String string, String word) {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "sundays is all good for sudden sunsunbaths, especially when there are no tsunamis";
        String word = "sun";
        System.out.println(new RegularExpression().getCountOfWord(string, word));
    }
}
