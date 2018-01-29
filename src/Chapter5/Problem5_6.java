package Chapter5;

/**
 * Created by YangHC on 2018-01-29.
 * <p>
 * [문제 5-6]
 * 변환 : 정수 A와 B를 2진수로 표현했을 때, A를 B로 바꾸기 위해 뒤집어야하는
 * 비트의 개수를 구하는 함수를 작성하라.
 * <p>
 * 결국 두 수의 다른 비트의 갯수를 세면 되는 문제
 */
public class Problem5_6 {
    public int getCoountDifferentbit(int n1, int n2) {
        return getCountOne(n1 ^ n2);
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
}
