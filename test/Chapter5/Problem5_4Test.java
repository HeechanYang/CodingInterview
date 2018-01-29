package Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-29.
 */
public class Problem5_4Test {
    private static Problem5_4 p4;

    @Before
    public void makeInstance() throws Exception {
        p4 = new Problem5_4();
    }

    @Test
    public void getMaxTest() {
        assertEquals(2013265920, p4.getMax(p4.getCountOne(232)));
        assertEquals(2080374784, p4.getMax(p4.getCountOne(488)));
        assertEquals(2113929216, p4.getMax(p4.getCountOne(984)));
    }

    @Test
    public void getMinTest() {
        assertEquals(15, p4.getMin(p4.getCountOne(232)));
        assertEquals(31, p4.getMin(p4.getCountOne(488)));
        assertEquals(63, p4.getMin(p4.getCountOne(984)));
    }

    @Test
    public void getCountOneTest() {
        assertEquals(4, p4.getCountOne(232));
        assertEquals(5, p4.getCountOne(488));
        assertEquals(6, p4.getCountOne(984));
    }
}
