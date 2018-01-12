package Chapter8;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-10.
 */
public class Problem8_2Test {
    private static Problem8_2 p2;

    @BeforeClass
    public static void makeInstance() throws Exception {
        p2 = new Problem8_2();
    }

    @Test
    public void testCountWays() {
        Problem8_2 p2 = new Problem8_2();

        int board1[][] = {  //27
                {0, 0, 0, 0, 0}
                , {0, 1, 0, 0, 1}
                , {0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0}};
        int board2[][] = {  //17
                {0, 0, 0, 0, 0}
                , {0, 1, 0, 0, 1}
                , {0, 1, 0, 0, 0}
                , {0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0}};
        int board3[][] = {  //12
                {0, 0, 0, 0, 0}
                , {0, 1, 0, 0, 1}
                , {0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0}};
        int board4[][] = {   //8
                {0, 0, 0, 0, 0}
                , {0, 1, 0, 0, 1}
                , {0, 1, 0, 0, 0}
                , {0, 0, 0, 0, 0}};

        p2.setBoard(board1);
        assertEquals(27, p2.getCountWays(p2.getR() - 1, p2.getC() - 1));

        p2.setBoard(board2);
        assertEquals(17, p2.getCountWays(p2.getR() - 1, p2.getC() - 1));

        p2.setBoard(board3);
        assertEquals(12, p2.getCountWays(p2.getR() - 1, p2.getC() - 1));

        p2.setBoard(board4);
        assertEquals(8, p2.getCountWays(p2.getR() - 1, p2.getC() - 1));
    }

}
