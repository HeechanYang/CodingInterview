package Chapter4;

import org.junit.Before;
import org.junit.Test;

import static Chapter4.Problem4_4.ERROR;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by YangHC on 2018-01-22.
 */
public class Problem4_4Test {
    private static Problem4_4 p4;

    @Before
    public void makeInstance() throws Exception {
        p4 = new Problem4_4();
    }

    @Test
    public void checkHeightTest1(){
        p4.setTreeExample1();

        assertEquals(ERROR,p4.preOrderTraversal(p4.getNodes().get(5)));
    }

    @Test
    public void checkHeightTest2(){
        p4.setTreeExample2();

        assertEquals(ERROR,p4.preOrderTraversal(p4.getNodes().get(0)));
    }

    @Test
    public void checkHeightTest3(){
        p4.setTreeExample3();

        assertNotEquals(ERROR,p4.preOrderTraversal(p4.getNodes().get(0)));
    }
}
