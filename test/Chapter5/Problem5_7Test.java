package Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-29.
 */
public class Problem5_7Test {
    private static Problem5_7 p7;

    @Before
    public void makeInstance() throws Exception {
        p7 = new Problem5_7();
    }

    @Test
    public void swapEachTwoBitTest() {
        assertEquals(926, p7.swapEachTwoBit(877));
        assertEquals(4481, p7.swapEachTwoBit(8770));
    }

}
