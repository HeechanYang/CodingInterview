package Chapter5;

/**
 * Created by YangHC on 2018-01-29.
 * <p>
 * [문제 5-5]
 * 디버거 : 다음 코드가 하는 일을 설명하라.
 */
public class Problem5_5 {
    // 주어진 수가 2의 거듭제곱인지 확인하는 함수
    //ex)
    // 11111111
    //&11111110
    //=11111110 (false)
    // 10000000
    //&01111111
    // 00000000 (true)
    public boolean func(int num) {
        return (num & (num - 1)) == 0;
    }
}
