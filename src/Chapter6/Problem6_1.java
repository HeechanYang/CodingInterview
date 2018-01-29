package Chapter6;

/**
 * Created by YangHC on 2018-01-26.
 * <p>
 * [문제 6-1]
 * 무거운 알약 : 약병 20개가 있다. 이 중 19개에는 1.0그램짜리 알약들이 들어있고,
 * 하나에는 1.1그램짜리 알약들이 들어있다. 정확한 저울 하나가 주어졌을 때, 무거운
 * 약병을 찾으려면 어떻게 해야 할까? 저울은 딱 한 번만 쓸 수 있다.
 * <p>
 * 1. 각 병을 일렬로 세워놓고, 0번부터 19번까지 번호를 메긴다.
 * 2. 각 병에서 번호만큼의 알약을 꺼낸다.
 * 3. 총 무게를 재면 (무거운 알약의 갯수 * 0.1그램) 만큼 더 나갈 것이다.
 */
public class Problem6_1 {
    public static final double WEIGHT_OF_PILL = 1.0f;
    public static final double WEIGHT_OF_HEAVY_PILL = 1.1f;

    public int getHeavyPillBottleIdx(double weight) {
        return (int) (weight * 10) - 1900;
    }

    public double getTotalWeight(int numOfBottle, int heavyPillBottleIdx) {
        double totalWeight = 0;
        for (int i = 0; i < numOfBottle; i++) {
            if (i == heavyPillBottleIdx) {
                totalWeight += WEIGHT_OF_HEAVY_PILL;
            } else {
                totalWeight += WEIGHT_OF_PILL;
            }
        }
        return totalWeight;
    }
}
