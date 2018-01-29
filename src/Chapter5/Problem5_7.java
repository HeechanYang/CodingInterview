package Chapter5;

/**
 * Created by YangHC on 2018-01-29.
 * <p>
 * [문제 5-7]
 * 쌍끼리 맞바꾸기 : 명령어를 가능한 한 적게 사용해서 주어진 정수의 짝수 번째 비트의
 * 값과 홀수 번째 비트의 값을 바꾸는 프로그램을 작성하라.
 * <p>
 * [Ex.]
 * 0번째 비트와 1번째 비트를 바꾸고
 * 1번째 비트와 2번째 비트를 바꾸는 식으로..
 * <p>
 * 1010101010101010101010101010101010101010 로 AND 연산한 수를 오른쪽 시프트
 * 0101010101010101010101010101010101010101 로 AND 연산한 수를 왼쪽 시프트 하여 더하면 됨
 */
public class Problem5_7 {
    private final int ODD_MASK = 1431655765;
    private final int EVEN_MASK = ODD_MASK << 1;

    public int swapEachTwoBit(int num) {
        return ((num & ODD_MASK) << 1) | ((num & EVEN_MASK) >>> 1);
    }
}
