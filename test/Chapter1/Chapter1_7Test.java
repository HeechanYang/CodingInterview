package Chapter1;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by YangHC on 2018-01-23.
 */
public class Chapter1_7Test {
    private static Problem1_7 p7;

    @BeforeClass
    public static void makeInstance() throws Exception {
        p7 = new Problem1_7();
    }

    @Test
    public void getRotatedImageTest() {
        assertArrayEquals(new int[][]{
                        {13, 9, 5, 1}
                        , {14, 10, 6, 2}
                        , {15, 11, 7, 3}
                        , {16, 12, 8, 4}}
                , p7.getRotatedImageClockWise(new int[][]{
                        {1, 2, 3, 4}
                        , {5, 6, 7, 8}
                        , {9, 10, 11, 12}
                        , {13, 14, 15, 16}}));

        assertArrayEquals(new int[][]
                        {{4, 8, 12, 16}
                                , {3, 7, 11, 15}
                                , {2, 6, 10, 14}
                                , {1, 5, 9, 13}}
                , p7.getRotatedImageReverseClockWise(new int[][]{
                        {1, 2, 3, 4}
                        , {5, 6, 7, 8}
                        , {9, 10, 11, 12}
                        , {13, 14, 15, 16}}));

        assertArrayEquals(new int[][]{
                        {21, 16, 11, 6, 1}
                        , {22, 17, 12, 7, 2}
                        , {23, 18, 13, 8, 3}
                        , {24, 19, 14, 9, 4}
                        , {25, 20, 15, 10, 5}}
                , p7.getRotatedImageClockWise(new int[][]{
                        {1, 2, 3, 4, 5}
                        , {6, 7, 8, 9, 10}
                        , {11, 12, 13, 14, 15}
                        , {16, 17, 18, 19, 20}
                        , {21, 22, 23, 24, 25}}));

        assertArrayEquals(new int[][]{
                        {31,25,19,13,7,1}
                        , {32,26,20,14,8,2}
                        , {33,27,21,15,9,3}
                        , {34,28,22,16,10,4}
                        , {35,29,23,17,11,5}
                        , {36,30,24,18,12,6}}
                , p7.getRotatedImageClockWise(new int[][]{
                        {1, 2, 3, 4, 5, 6}
                        , {7, 8, 9, 10, 11, 12}
                        , {13, 14, 15, 16, 17, 18}
                        , {19, 20, 21, 22, 23, 24}
                        , {25, 26, 27, 28, 29, 30}
                        , {31, 32, 33, 34, 35, 36}}));
    }
}
