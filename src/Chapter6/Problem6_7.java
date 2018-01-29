package Chapter6;

/**
 * Created by YangHC on 2018-01-26.
 * <p>
 * [문제 6-7]
 * 대재앙 : 대재앙 이후에 여왕은 출산율 때문에 근심이 이만저만이 아니다. 그래서
 * 그녀는 모든 가족은 여자 아이 하나를 낳거나 어마어마한 벌금을 내야 한다는 법령을
 * 만들어 발표했다. 만약 모든 가족이 이 정책을 따른다면(즉, 여자 아이 한 명을 낳을
 * 때까지 아이를 계속 낳는다면) 다음 세대의 남녀 비율은 어떻게 되겠는가? 남자 혹은
 * 여자를 임신할 확률은 같다고 가정한다.논리적으로 이 문제를 푼 뒤에 컴퓨터로
 * 시뮬레이션 해보라.
 * <p>
 * p=1/2; //아들 확률
 * q=1/2; //딸 확률
 * 0남 1여 : p^0q
 * 1남 1여 : p^1q
 * 2남 1여 : p^2q
 * 3남 1여 : p^3q
 * ...
 */
public class Problem6_7 {
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
