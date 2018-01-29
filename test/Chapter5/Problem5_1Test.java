package Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-22.
 */
public class Problem5_1Test {
    private static Problem5_1 p1;

    @Before
    public void makeInstance() throws Exception {
        p1 = new Problem5_1();
    }

    @Test
    public void getLongestOneLength() {
        assertEquals(2124, p1.insertMIntoN(19, 2048, 2, 6));
//        assertEquals(7, p3.getLongestOneLength(7902));
//        assertEquals(7, p3.getLongestOneLength(3806));
    }


}
