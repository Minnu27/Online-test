import java.util.*;

public class MissingIntegerInBinaryRepresentation {

    public static String findMissingInteger(int n, String[] binaryNums) {
        int[] binaryCounts = new int[n];

        for (String binaryNum : binaryNums) {
            for (int i = 0; i < binaryNum.length(); i++) {
                if (binaryNum.charAt(i) == '1') {
                    binaryCounts[i]++;
                }
            }
        }

        int missingInteger = 0;
        for (int i = 0; i < n; i++) {
            if (binaryCounts[i] == 0) {
                missingInteger += (1 << i);
            }
        }

        return String.valueOf(missingInteger);
    }

    public static void main(String[] args) {
        int n = 5;
        String[] binaryNums = new String[]{"0", "01", "010", "100", "101"};

        String missingInteger = findMissingInteger(n, binaryNums);

        System.out.println(missingInteger);
    }
}
