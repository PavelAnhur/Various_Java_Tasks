package algoritm.search;

import java.util.Arrays;

public class BinarySearch {
    private int[] numbers;

    public BinarySearch(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getSortedNumbers(int[] numbers) {
        return Arrays.stream(numbers).sorted().toArray();
    }

    public int getBinarySearchResult(int searchNumber) {
        numbers = getSortedNumbers(numbers);
        System.out.println(Arrays.toString(numbers));
        int firstElementIndex = 0;
        int lastElementIndex = numbers.length - 1;
        int middleElementIndex = numbers.length / 2;
        while (firstElementIndex <= lastElementIndex) {
            if (searchNumber > numbers[middleElementIndex]) {
                firstElementIndex = middleElementIndex + 1;
            } else if (numbers[middleElementIndex] == searchNumber) {
                return middleElementIndex;
            } else {
                lastElementIndex = middleElementIndex - 1;
            }
            middleElementIndex = (firstElementIndex + lastElementIndex) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 25, 1, 4578, 65, 9};
        BinarySearch binarySearch = new BinarySearch(numbers);
        System.out.println(binarySearch.getBinarySearchResult(2));
    }
}
