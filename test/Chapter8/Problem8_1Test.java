package Chapter8;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-10.
 */
public class Problem8_1Test {
    private static Problem8_1 p1;

    @BeforeClass
    public static void makeInstance()throws Exception {
        p1 = new Problem8_1();
    }

    @Test
    public void testCountWays(){
        assertEquals(1, p1.getCountWays(1));
        assertEquals(2, p1.getCountWays(2));
        assertEquals(4, p1.getCountWays(3));
        assertEquals(7, p1.getCountWays(4));
        assertEquals(13, p1.getCountWays(5));
        assertEquals(24, p1.getCountWays(6));
        assertEquals(44, p1.getCountWays(7));
        assertEquals(81, p1.getCountWays(8));
        assertEquals(149, p1.getCountWays(9));
    }

}
