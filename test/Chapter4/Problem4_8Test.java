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

    @Before
    public void makeInstance() throws Exception {
        p8 = new Problem4_8();
    }


    @Test
    public void getLastAncestor1() {
        p8.setTreeExample1();
        assertEquals("a", p8.getLatestAncestor(p8.getNodes().get(5), p8.getNodes().get(3), p8.getNodes().get(4)).getName());
        assertEquals("a", p8.getLatestAncestor(p8.getNodes().get(5), p8.getNodes().get(2), p8.getNodes().get(4)).getName());
    }


    @Test
    public void getLastAncestor2() {
        p8.setTreeExample2();
        assertEquals("a", p8.getLatestAncestor(p8.getNodes().get(0), p8.getNodes().get(4), p8.getNodes().get(5)).getName());
        assertEquals("b", p8.getLatestAncestor(p8.getNodes().get(0), p8.getNodes().get(4), p8.getNodes().get(6)).getName());
        assertEquals("b", p8.getLatestAncestor(p8.getNodes().get(0), p8.getNodes().get(1), p8.getNodes().get(6)).getName());
    }


    @Test
    public void getLastAncestor3() {
        p8.setTreeExample3();
        assertEquals("b", p8.getLatestAncestor(p8.getNodes().get(0), p8.getNodes().get(7), p8.getNodes().get(5)).getName());
        assertEquals("a", p8.getLatestAncestor(p8.getNodes().get(0), p8.getNodes().get(6), p8.getNodes().get(8)).getName());
    }

}
