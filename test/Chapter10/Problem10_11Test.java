package Chapter10;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-12.
 */
public class Problem10_11Test {
    private static Problem10_11 p11;

    @BeforeClass
    public static void makeInstance() throws Exception {
        p11 = new Problem10_11();
    }

    @Test
    public void convertToZigZagArray(){
        int arr[] = {5, 3, 1, 2, 3};
        assertArrayEquals(new int[]{5,1,3,2,3},p11.getZigZagArray(arr));
        int arr2[] = {5, 3, 1, 2, 3, 2};
        assertArrayEquals(new int[]{5,1,3,2,3,2},p11.getZigZagArray(arr2));
        int arr3[] = {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(new int[]{10,1,9,2,8,3,7,4,6,5},p11.getZigZagArray(arr3));
    }
}
