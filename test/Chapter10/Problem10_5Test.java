package Chapter10;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-12.
 */
public class Problem10_5Test {
    private static Problem10_5 p5;

    @BeforeClass
    public static void makeInstance() throws Exception {
        p5 = new Problem10_5();
    }

    @Test
    public void testIndexOf(){
        assertEquals(0,p5.indexOf("at"));
        assertEquals(4,p5.indexOf("ball"));
        assertEquals(7,p5.indexOf("car"));
        assertEquals(10,p5.indexOf("dad"));
    }
}
