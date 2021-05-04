package codewar.sixthKyu.phone;

public class PhoneNumber {
    private final StringBuilder phoneNumber;
    private final int[] numbers;

    public PhoneNumber(int[] numbers) {
        this.numbers = numbers;
        this.phoneNumber = new StringBuilder();
    }

    public String createPhoneNumber() {
        phoneNumber
                .append("(")
                .append(getPhoneNumberString(0, 2))
                .append(") ")
                .append(getPhoneNumberString(3, 5))
                .append("-")
                .append(getPhoneNumberString(6, numbers.length - 1));
        return String.valueOf(phoneNumber);
    }

    private String getPhoneNumberString(int startIndex, int endIndex) {
        StringBuilder number = new StringBuilder();
        for (int i = startIndex; i <= endIndex; i++) {
            number.append(numbers[i]);
        }
        return String.valueOf(number);
    }
}
