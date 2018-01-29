package Chapter6;

/**
 * Created by YangHC on 2018-01-26.
 * <p>
 * [문제 6-9]
 * 100 라커 : 복도에 100개의 라커가 있다. 어떤 남자가 100개의 라커 문을 저부 연다.
 * 그러고 나서 짝수 번호의 라커를 전부 닫는다. 그다음에는 번호가 3의 배수인 라커를
 * 순서대로 찾아다니며 열려있으면 닫고, 닫혀있으면 연다. 이런 식으로 복도를 100번
 * 지나가면(마지막에는 100번째 라커의 문을 열거나 닫을 것이다) 열린 라커문은 몇 개가
 * 되겠는가?
 */
public class Problem6_9 {
    public static final double SON_PROBABILITY = 0.5f;
    public static final double DAUGHTER_PROBABILITY = 0.5f;

    public double getSexRatio() {
        double sonRatio = 0;
        double daughterRatio = 0;
        for (int i = 0; i < 10000; i++) {
            double thisProbability = Math.pow(SON_PROBABILITY, i) * DAUGHTER_PROBABILITY;
            sonRatio += thisProbability * i;
            daughterRatio += thisProbability;
        }
        return sonRatio / daughterRatio; //아들 : 딸    (작을 수록 딸이 더 많음)
    }
}
