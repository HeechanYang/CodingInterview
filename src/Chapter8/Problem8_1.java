package Chapter8;

import java.util.Arrays;

/**
 * Created by YangHC on 2018-01-10.
 *
 * [문제 8-1]
 * 트리플 스텝 : 어떤 아이가 n개의 계단을 오른다. 한 번에 1계단 오르기도 하고, 2계단이나 3계단을 오르기도 한다.
 * 계단을 오르는 방법이 몇 가지가 있는지 계산하는 메서드를 구현하라.
 *
 * [Recursive], [Dynamic Programming]
 */

public class Problem8_1 {
    private int waysCount[];

    public Problem8_1(int n) {
        waysCount = new int[n];
        Arrays.fill(waysCount, -1);
        waysCount[0] = 1;
        waysCount[1] = 2;
        waysCount[2] = 4;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Problem8_1 p1 = new Problem8_1(n);
        System.out.println(p1.getCountWays(n));
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
