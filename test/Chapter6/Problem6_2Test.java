package Chapter6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-22.
 */
public class Problem6_2Test {
    double DELTA = 1e-15;
    private static Problem6_2 p2;

    @Before
    public void makeInstance() throws Exception {
        p2 = new Problem6_2();
    }


    @Test
    public void getPossibilityGame1Test() {
        double p = 1f / 3f;
        assertEquals(0.3333333432674408, p2.getPossibilityGame1(p), DELTA);
        p = 1f / 2f;
        assertEquals(0.5, p2.getPossibilityGame1(p), DELTA);
        p = 2f / 3f;
        assertEquals(0.6666666865348816, p2.getPossibilityGame1(p), DELTA);
    }

    @Test
    public void getPossibilityGame2Test() {
        double p = 1f / 3f;
        assertEquals(0.25925927250473596, p2.getPossibilityGame2(p), DELTA);
        p = 1f / 2f;
        assertEquals(0.5, p2.getPossibilityGame2(p), DELTA);
        p = 2f / 3f;
        assertEquals(0.7407407672316936, p2.getPossibilityGame2(p), DELTA);
    }

    @Test
    public void choiceGameTest() {
        double p = 1f / 3f;
        assertEquals("Game1", p2.choiceGame(p));
        p = 1f / 2f;
        assertEquals("Game1", p2.choiceGame(p));
        p = 2f / 3f;
        assertEquals("Game2", p2.choiceGame(p));
    }
}
