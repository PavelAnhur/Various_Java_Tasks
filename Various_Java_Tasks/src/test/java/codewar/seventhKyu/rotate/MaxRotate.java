package codewar.seventhKyu.rotate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxRotate {

    public static long maxRot(long n) {
        List<Integer> digitsOfNumber = getDigitsOfNumber(n);
        return getMaxRotateNumber(digitsOfNumber);
    }

    private static long getNumber(List<Integer> digitsOfNumber) {
        long number = 0;
        for (int i = 0; i < digitsOfNumber.size(); i++) {
            if (i == 0) {
                number = digitsOfNumber.get(0);
            } else {
                number = number * 10 + digitsOfNumber.get(i);
            }
        }
        return number;
    }

    private static long getMaxRotateNumber(List<Integer> digitsOfNumber) {
        long tempNumber = getNumber(digitsOfNumber);
        for (int i = 0; i < digitsOfNumber.size(); i++) {
            digitsOfNumber.forEach((d) -> System.out.print(d + " "));
            System.out.println();
            int digit = digitsOfNumber.remove(i);
            digitsOfNumber.add(digitsOfNumber.size(), digit);
            System.out.println("Digit = " + digit);
            digitsOfNumber.forEach((d) -> System.out.print(d + " "));
            System.out.println();
            System.out.println("**********");
            long rotateNumber = getNumber(digitsOfNumber);
            if (rotateNumber > tempNumber) {
                tempNumber = rotateNumber;
            }
        }
        return tempNumber;
    }

    private static List<Integer> getDigitsOfNumber(long n) {
        List<Integer> digitsOfNumber = new ArrayList<>();
        int digit;
        do {
            digit = (int) (n % 10);
            digitsOfNumber.add(digit);
            n /= 10;
        } while (n > 0);
        Collections.reverse(digitsOfNumber);
        System.out.println("List of digits: " + digitsOfNumber);
        return digitsOfNumber;
    }

    public static void main(String[] args) {
        System.out.println(MaxRotate.maxRot(56789));
    }
}
