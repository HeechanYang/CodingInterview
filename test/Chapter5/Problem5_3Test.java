package Chapter5;

import Chapter6.Problem6_1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-22.
 */
public class Problem5_3Test {
    private static Problem5_3 p3;

    @Before
    public void makeInstance() throws Exception {
        p3 = new Problem5_3();
    }

    @Test
    public void getLongestOneLength() {
//        assertEquals(9, p3.getLongestOneLength(32478));
        assertEquals(8, p3.getLongestOneLength(16094));
        assertEquals(7, p3.getLongestOneLength(7902));
        assertEquals(7, p3.getLongestOneLength(3806));
    }
}
