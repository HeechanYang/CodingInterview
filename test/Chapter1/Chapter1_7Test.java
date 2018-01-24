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
        int[][] image1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] image2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

        assertArrayEquals(new int[][]{{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}}, p7.getRotatedImageClockWise(image1));
        assertArrayEquals(new int[][]{{21, 16, 11, 6, 1}, {22, 17, 12, 7, 2}, {23, 18, 13, 8, 3}, {24, 19, 14, 9, 4}, {25, 20, 15, 10, 5}}, p7.getRotatedImageClockWise(image2));
    }
}
