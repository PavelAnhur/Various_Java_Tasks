package algoritm.sort;

import java.util.Arrays;

public class BubbleSort {

    private final int[] numbers;

    public BubbleSort(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getSortedNumbers() {
        boolean sorted = false;
        int temp;

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < numbers.length-1; i++) {
                if (numbers[i] > numbers[i+1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] arg) {
        int[] intNumbers = {7, 6, 4, 3, 6};
        BubbleSort bubbleSort = new BubbleSort(intNumbers);
        System.out.println(Arrays.toString(bubbleSort.getSortedNumbers()));
    }
}
