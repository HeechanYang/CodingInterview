package Chapter5;

/**
 * Created by YangHC on 2018-01-29.
 * <p>
 * [문제 5-1]
 * 삽입 : 두 개의 32비트 수 N과 M이 주어지고, 비트 위치 i와 j가 주어졌을 때,
 * M을 N에 삽입하는 메서드를 구현ㄴ하ㅏ. M은 N의 j번째 비트에서 시작하여 i번째
 * 비트에서 끄탄다. j번째 비트에서 i번째 비트까지에느 M을 답기 충분한 공간이
 * 있다고 가정한다.
 * <p>
 * [Ex.]
 * 입력 : N = 10000000000, M = 10011, i = 2, j = 6
 * 출력 : N = 10001001100
 */
public class Problem5_1 {
    public int insertMIntoN(int M, int N, int i, int j) {
        int result = 0;
        N = clearBitsIToJ(N, i, j);
        N = N | (M << i);
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
        int mask = ((-1) << (j+1)) + ((1 << (i)) - 1);
        return num & mask;
    }
}
