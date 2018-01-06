package Chapter16;

/**
 * Created by YangHC on 2018-01-06.
 */
public class Problem6 {
    private long[] arr1 = {1, 3, 15, 11, 2};
    private long[] arr2 = {23, 127, 235, 19, 8};

    private long[] minGapPair = new long[2];

    public static void main(String[] args) {
        Problem6 p6 = new Problem6();

        p6.setMinGapPair(p6.getArr1(), p6.getArr2());

        long[] minGapPair = p6.getMinGapPair();

        System.out.println("{" + minGapPair[0] + ", " + minGapPair[1] + "}");
    }

    public long getGap(long num1, long num2) {
        long abs1 = Math.abs(num1), abs2 = Math.abs(num2);
        if (abs1 > abs2) {
            return abs1 - abs2;
        } else {
            return abs2 - abs1;
        }
    }

    public void setMinGapPair(long[] arr1, long[] arr2) {
        long minGap = getGap(arr1[0], arr2[0]);
        minGapPair[0]=arr1[0];
        minGapPair[1]=arr2[0];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                long thisGap = getGap(arr1[i], arr2[j]);
                if (thisGap < minGap) {
                    minGap = thisGap;
                    minGapPair[0]=arr1[i];
                    minGapPair[1]=arr2[j];
                }
            }
        }
    }

    public long[] getArr1() {
        return arr1;
    }

    public long[] getArr2() {
        return arr2;
    }

    public long[] getMinGapPair() {
        return minGapPair;
    }
}
