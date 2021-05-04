package codewar.seventhKyu.rotate;

public class MaxRotateWithStringBuilder {

    public static long maxRot(long n) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(n));
        for (int i = 0; i < stringBuilder.length(); i++) {
            long rotateNumber = getRotateNumber(stringBuilder, i);
            if (rotateNumber > n) {
                n = rotateNumber;
            }
        }
        return n;
    }

    private static long getRotateNumber(StringBuilder stringBuilder, int index) {
        char tempDigit = stringBuilder.charAt(index);
        stringBuilder.deleteCharAt(index);
        stringBuilder.append(tempDigit);
        return Long.parseLong(String.valueOf(stringBuilder));
    }

    public static void main(String[] args) {
        System.out.println(MaxRotateWithStringBuilder.maxRot(4567989874513132131L));
    }
}
