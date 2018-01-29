package Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-29.
 */
public class Problem5_6Test {
    private static Problem5_6 p6;

    @Before
    public void makeInstance() throws Exception {
        p6 = new Problem5_6();
    }

    @Test
    public void isBinaryExponentiationTest() {
        assertEquals(2, p6.getCoountDifferentbit(483, 485));
        assertEquals(3, p6.getCoountDifferentbit(483, 493));
        assertEquals(4, p6.getCoountDifferentbit(483, 509));
    }

}
