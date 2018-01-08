package Chapter16;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-06.
 */
public class Problem8Test {
    private static Problem8 p8;

    @BeforeClass
    public static void makeInstance()throws Exception {
        p8 = new Problem8();
    }

    @Test
    public void getDevideCountOfNumber(){
        assertEquals(1,p8.getDevideCountOfNumber(100));
        assertEquals(2,p8.getDevideCountOfNumber(1000));
        assertEquals(2,p8.getDevideCountOfNumber(10000));
        assertEquals(3,p8.getDevideCountOfNumber(1000000));
        assertEquals(3,p8.getDevideCountOfNumber(10000000));
    }


}
