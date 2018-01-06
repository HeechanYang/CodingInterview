package Chapter16;

/**
 * Created by YangHC on 2018-01-06.
 */
public class Problem6 {
    private int[] arr1 = {1, 3, 15, 11, 2};
    private int[] arr2 = {23, 127, 235, 19, 8};

    public static void main(String[] args) {

    }

    public long getGap(long num1, long num2) {
        long abs1 = Math.abs(num1), abs2 = Math.abs(num2);
        if (abs1 > abs2) {
            return abs1-abs2;
        } else {
            return abs2-abs1;
        }
    }
}
