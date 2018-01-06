package Chapter16;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-06.
 */
public class Problem6Test {
    private static Problem6 p6;

    @BeforeClass
    public static void makeInstance()throws Exception {
        p6 = new Problem6();
    }

    @Test
    public void getGap(){
        assertEquals(101, p6.getGap(162,263));
        assertEquals(99, p6.getGap(262,163));
        assertEquals(1, p6.getGap(263,262));
        assertEquals(0, p6.getGap(262,262));
    }
    @Test
    public void getMinGapPair(){
        assertEquals(11, p6.getMinGapPair(p6.getArr1(),p6.getArr2())[0]);
        assertEquals(8, p6.getMinGapPair(p6.getArr1(),p6.getArr2())[1]);
    }

    @Test
    public void getMinValueOfArray(){
        assertEquals(1, p6.getMinValueOfArray(p6.getArr1()));
        assertEquals(8, p6.getMinValueOfArray(p6.getArr2()));
    }
    @Test
    public void getMaxValueOfArray(){
        assertEquals(15, p6.getMaxValueOfArray(p6.getArr1()));
        assertEquals(235, p6.getMaxValueOfArray(p6.getArr2()));
    }
}
