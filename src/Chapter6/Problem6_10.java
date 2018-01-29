package Chapter6;

/**
 * Created by YangHC on 2018-01-26.
 * <p>
 * [문제 6-10]
 * 독극물 : 1,000개의 음료수 중 하나에 독극물이 들어 있다. 그리고 독극물을
 * 확인해 볼 수 있는 식별기 10개가 주어졌다. 독극물 한 방을을 식별기에 떨어뜨리면
 * 식별기가 변한다. 만약 식별기에 독극물을 떨어뜨리지 않았다면 몇 번이든 재사용해도
 * 된다. 하지만 이 테스트는 하루에 한 번만 할 수 있으며 결과를 얻기까지 일주일이 걸린다.
 * 독극물이 든 음료수를 가능한 한 빨리 찾아내려면 어떻게 해야할까?
 *
 * 음료수를 식별기의 갯수만큼 그루핑을 하여, 같은 식별기에 뿌려본다.
 *
 * 2진 탐색의 아이디어에서 기반
 */
public class Problem6_10 {
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
