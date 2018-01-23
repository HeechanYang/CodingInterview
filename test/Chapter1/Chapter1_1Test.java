package Chapter1;

import Chpater1.Problem1_1;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-23.
 */
public class Chapter1_1Test {
    private static Problem1_1 p1;

    @BeforeClass
    public static void makeInstance() throws Exception {
        p1 = new Problem1_1();
    }

    @Before
    public void setStringBuilder(){
    }

    @Test
    public void hasDuplicatedWordTest1() {
        p1.setSb("abcdefga");
        assertEquals(true, p1.hasDuplicatedWord());
    }

    @Test
    public void hasDuplicatedWordTest2() {
        p1.setSb("abcdefghijklmnop");
        assertEquals(false, p1.hasDuplicatedWord());
    }
    @Test
    public void hasDuplicatedWordTest3() {
        p1.setSb("qrsakjnxvba");
        assertEquals(true, p1.hasDuplicatedWord());
    }
}
