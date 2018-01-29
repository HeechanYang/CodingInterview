package Chapter6;

/**
 * Created by YangHC on 2018-01-26.
 * <p>
 * [문제 6-2]
 * 농구 : 농구 골대가 하나 있는데 다음 두 게임 중 하나를 해볼 수 있다.
 * 게임 1 : 슛을 한 번 쏴서 골대에 넣어야 한다.
 * 게임 2 : 슛을 세 번 쏴서 두 번 골대에 넣어야 한다.
 * 슛을 넣을 확률이 p라고 했을 때 p가 어떤 값일 때 첫 번째 게임을, 혹은
 * 두 번째 게임을 선택하겠는가?
 */
public class Problem6_2 {
    public static void main(String[] args) {
        Problem6_2 p2 = new Problem6_2();
        double p = 1f / 3f;
        System.out.println(p2.getPossibilityGame1(p));
        System.out.println(p2.getPossibilityGame2(p));

        p = 1f / 2f;
        System.out.println(p2.getPossibilityGame1(p));
        System.out.println(p2.getPossibilityGame2(p));

        p = 2f / 3f;
        System.out.println(p2.getPossibilityGame1(p));
        System.out.println(p2.getPossibilityGame2(p));
    }

    public String choiceGame(double p) {
        return getPossibilityGame1(p) >= getPossibilityGame2(p) ? "Game1" : "Game2";
    }

    public double getPossibilityGame1(double p) {
        return p;
    }

    public double getPossibilityGame2(double p) {
        double q = 1 - p;
        return Math.pow(p, 2) * q * 3 + Math.pow(p, 3);
    }
}
