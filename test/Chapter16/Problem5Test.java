package Chapter16;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by YangHC on 2018-01-06.
 */
public class Problem5Test {
    private static Problem5 p5;

    @BeforeClass
    public static void makeInstance()throws Exception {
        p5 = new Problem5();
    }

    @Test
    public void testFindLastZeros(){
        assertEquals(3, p5.findLastZeros(124000));
    }

    @Test
    public void testFactorialN(){
        assertEquals(120, p5.factorialN(5));
    }

    @Test
    public void testCount5(){
        assertEquals(1, p5.count5(5));
        assertEquals(2, p5.count5(25));
        assertEquals(0, p5.count5(26));
        assertEquals(2, p5.count5(100));
    }
}
