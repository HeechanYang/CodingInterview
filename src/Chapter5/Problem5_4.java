package Chapter5;

/**
 * Created by YangHC on 2018-01-29.
 */
public class Problem5_4 {
    public int getMax(int oneCnt) {
        return ((-1) << (Integer.SIZE - oneCnt))>>>1;
    }
    public int getMin(int oneCnt) {
        return ((-1) >>> (Integer.SIZE - oneCnt));
    }

    public int getCountOne(int num) {
        int mask = 1;
        int count = 0;
        for (int i = 0; i < Integer.SIZE; i++) {
            if ((num & mask) != 0) {
                count++;
            }
            mask <<= 1;
        }
        return count;
    }

    public int getBit(int num, int i) {
        if ((num & (1 << i)) != 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
