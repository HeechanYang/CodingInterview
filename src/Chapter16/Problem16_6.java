package Chapter16;

import java.util.Arrays;

/**
 * Created by YangHC on 2018-01-06.
 */
public class Problem16_6 {
    private long[] arr1 = {1, 3, 15, 11, 2};
    private long[] arr2 = {23, 127, 235, 19, 8};

    public static void main(String[] args) {
        Problem16_6 p6 = new Problem16_6();
        p6.sortArray(p6.getArr1());
        p6.sortArray(p6.getArr2());
        p6.deleteUnnecessaryNumber(p6.getArr1(), p6.getArr2());
        System.out.println(p6.getArr1().length);
//        long[] minGapPair = p6.getMinGapPair(p6.getArr1(), p6.getArr2());
//        System.out.println("{" + minGapPair[0] + ", " + minGapPair[1] + "}");


    }

    public void deleteUnnecessaryNumber(long[] arr1, long[] arr2) {
        int s1, s2;
        int e1, e2;


    }

    public long getMinValueOfArray(long[] arr) {
        long min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public long getMaxValueOfArray(long[] arr) {
        long max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public long getGap(long num1, long num2) {
        long abs1 = Math.abs(num1), abs2 = Math.abs(num2);
        if (abs1 > abs2) {
            return abs1 - abs2;
        } else {
            return abs2 - abs1;
        }
    }

    public long[] getMinGapPair(long[] arr1, long[] arr2) {
        long minGap = getGap(arr1[0], arr2[0]);
        long[] minGapPair = new long[2];
        minGapPair[0] = arr1[0];
        minGapPair[1] = arr2[0];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                long thisGap = getGap(arr1[i], arr2[j]);
                if (thisGap < minGap) {
                    minGap = thisGap;
                    minGapPair[0] = arr1[i];
                    minGapPair[1] = arr2[j];
                }
            }
        }
        return minGapPair;
    }

    public long[] getArr1() {
        return arr1;
    }

    public long[] getArr2() {
        return arr2;
    }

    public void sortArray(long[] arr) {
        Arrays.sort(arr);
    }
}
