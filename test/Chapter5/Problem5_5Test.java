package Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-29.
 */
public class Problem5_5Test {
    private static Problem5_5 p5;

    @Before
    public void makeInstance() throws Exception {
        p5 = new Problem5_5();
    }

    @Test
    public void isBinaryExponentiation() {
        assertEquals(true, p5.func(1));
        assertEquals(true, p5.func(2));
        assertEquals(true, p5.func(4));
        assertEquals(true, p5.func(8));
        assertEquals(true, p5.func(16));
        assertEquals(true, p5.func(32));
        assertEquals(false, p5.func(31));
        assertEquals(false, p5.func(17));
    }

}
