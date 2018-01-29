package Chapter6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-22.
 */
public class Problem6_7Test {
    double DELTA = 1e-5;
    private static Problem6_7 p7;

    @Before
    public void makeInstance() throws Exception {
        p7 = new Problem6_7();
    }


    @Test
    public void getSexRatioTest() {
        assertEquals(1.0, p7.getSexRatio(), DELTA);
    }
}
