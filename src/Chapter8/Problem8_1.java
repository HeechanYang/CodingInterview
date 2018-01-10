package Chapter8;

import java.util.Arrays;

/**
 * Created by YangHC on 2018-01-10.
 */
public class Problem8_1 {
    private int waysCount[] = new int[99999];

    public Problem8_1() {
        Arrays.fill(waysCount, -1);
        waysCount[0] = 1;
        waysCount[1] = 2;
        waysCount[2] = 4;
    }

    public static void main(String[] args) {
        Problem8_1 p1 = new Problem8_1();

//        int n = Integer.parseInt(args[0]);
        System.out.println(p1.getCountWays(4));
    }

    public int getCountWays(int n) {
        int n1, n2, n3;
        if (n == 1) {
            return waysCount[0];
        } else if (n == 2) {
            return waysCount[1];
        } else if (n == 3) {
            return waysCount[2];
        } else {
            if (waysCount[n - 2] == -1) {
                waysCount[n - 2] = getCountWays(n - 1);
            }
            if (waysCount[n - 3] == -1) {
                waysCount[n - 3] = getCountWays(n - 2);
            }
            if (waysCount[n - 4] == -1) {
                waysCount[n - 4] = getCountWays(n - 3);
            }
            n1 = waysCount[n - 2];
            n2 = waysCount[n - 3];
            n3 = waysCount[n - 4];

            return n1 + n2 + n3;
        }
    }
}
