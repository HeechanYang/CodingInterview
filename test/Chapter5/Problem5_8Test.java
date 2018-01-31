package Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-29.
 */
public class Problem5_8Test {
    private static Problem5_8 p8;

    @Before
    public void makeInstance() throws Exception {
        p8 = new Problem5_8();
    }

    @Test
    public void isBinaryExponentiation() {
        byte[] board = {1,1,1,1,1,1,1,1,1,1,1,1};
        assertArrayEquals(new byte[]{1,1,1,1,-1,1,1,1,1,1,1,1}, p8.drawLine(board,32,0,7,1));
        assertArrayEquals(new byte[]{1,1,1,1,-1,-1,1,1,1,1,1,1}, p8.drawLine(board,32,0,8,1));
    }

}
