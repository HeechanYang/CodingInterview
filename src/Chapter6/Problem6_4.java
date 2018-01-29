package Chapter6;

/**
 * Created by YangHC on 2018-01-26.
 * <p>
 * [문제 6-4]
 * 삼각형 위의 개미 : 개미 세 마리가 삼각형의 각 꼭짓점에 있다. 개미 세 마리가 삼각형
 * 모서리를 따라 걷기 시작했을 때, ...
 */
public class Problem6_4 {
    public static final double LEFT_PROBABILITY = 0.5f;
    public static final double RIGHT_PROBABILITY = 0.5f;

    public double getCrushProbability(int n) {
        return 1 - Math.pow(LEFT_PROBABILITY, n) - Math.pow(RIGHT_PROBABILITY, n);
    }
}
