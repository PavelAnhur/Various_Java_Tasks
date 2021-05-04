package strings;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SortedString {

    private static final String REGEX = "\\s*(,)\\s*";
    private String text;

    public SortedString(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text == null) {
            System.out.printf("Text can't be %s \n", (String) null);
        }
        this.text = text;
    }

    public String getSortedString() {
        return Stream.of(text).flatMap((t) -> Arrays.stream(t.split(REGEX)))
                       .map((w) -> w.replaceFirst("\\u00A0",""))
                       .sorted()
                       .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String text = "Java Basics, Preparing CV, Business English, Applied Math, Spring in Action";
        SortedString sortedString = new SortedString(text);
        System.out.println(sortedString.getSortedString());
        sortedString.setText(" Applied Math, Business English, Java Basics,  Preparing CV, Spring in Action ");
        System.out.println(sortedString.getText());
    }
}
