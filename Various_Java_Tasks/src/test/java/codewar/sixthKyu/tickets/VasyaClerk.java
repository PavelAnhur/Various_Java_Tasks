package codewar.sixthKyu.tickets;

import java.util.Arrays;

public class VasyaClerk {

    public static String Tickets(int[] peopleInLine) {
        System.out.println(Arrays.toString(peopleInLine));
        int twentyFiveDollarsPeople = 0;
        int fiftyDollarsPeople = 0;
        int oneHundredDollarsPeople = 0;

        for (int man : peopleInLine) {
            if (man == 25) {
                twentyFiveDollarsPeople++;
            } else if (man == 50 && twentyFiveDollarsPeople > 0) {
                fiftyDollarsPeople++;
                twentyFiveDollarsPeople--;
            } else if (man == 100 && fiftyDollarsPeople > 0 && twentyFiveDollarsPeople > 0) {
                fiftyDollarsPeople--;
                twentyFiveDollarsPeople--;
            } else if (man == 100 && fiftyDollarsPeople == 0 && twentyFiveDollarsPeople >= 3) {
                twentyFiveDollarsPeople -= 3;
            } else {
                return "NO";
            }
        }

        System.out.println("25$ people: " + twentyFiveDollarsPeople);
        System.out.println("50$ people: " + fiftyDollarsPeople);
        System.out.println("100$ people: " + oneHundredDollarsPeople);

        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(VasyaClerk.Tickets(new int[]{50, 25, 25, 100}));
    }
}
