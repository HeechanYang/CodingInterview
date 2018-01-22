package Chapter4;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-22.
 */
public class Problem4_8Test {
    private static Problem4_8 p8;

    @BeforeClass
    public static void makeInstance() throws Exception {
        p8 = new Problem4_8();
        p8.setTreeExample1();
        p8.setParentStack();
    }

    @Before
    public void setInstance() {
        p8.setTreeExample1();
        p8.setParentStack();
    }

    @Test
    public void getFirstAncesterTest1() {
        assertEquals("f", p8.getFirstAncestor(5, 0).getName());
    }

    public void getFirstAncesterTest2() {
        assertEquals("f", p8.getFirstAncestor(5, 1).getName());
    }

    public void getFirstAncesterTest3() {
        assertEquals("f", p8.getFirstAncestor(5, 2).getName());
    }

    public void getFirstAncesterTest4() {
        assertEquals("f", p8.getFirstAncestor(5, 3).getName());
    }

    public void getFirstAncesterTest5() {
        assertEquals("f", p8.getFirstAncestor(5, 4).getName());
    }

    public void getFirstAncesterTest6() {
        assertEquals("f", p8.getFirstAncestor(5, 5).getName());
    }

    public void getFirstAncesterTest7() {
        assertEquals("f", p8.getFirstAncestor(0, 1).getName());
    }

    public void getFirstAncesterTest8() {
        assertEquals("a", p8.getFirstAncestor(3, 4).getName());
    }

    public void getFirstAncesterTest9() {
        assertEquals("a", p8.getFirstAncestor(2, 5).getName());
    }

    public void getFirstAncesterTest10() {
        assertEquals("d", p8.getFirstAncestor(2, 3).getName());
    }

    public void getFirstAncesterTest11() {
        assertEquals("d", p8.getFirstAncestor(3, 2).getName());
    }
}
