package Chapter5;

/**
 * Created by YangHC on 2018-01-29.
 */
public class Problem5_1 {
    public int insertMIntoN(int M, int N, int i, int j) {
        int result = 0;
        N = clearBitsIToJ(N, i, j);
        N = N + (M << i);
        return N;
    }

    public int getBit(int num, int i) {
        if ((num & (1 << i)) != 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int clearBitsIToJ(int num, int i, int j) {
        int mask = (-1 << (i + 1)) - ((1 << (i + 1)) - 1);
        return num & mask;
    }
}
