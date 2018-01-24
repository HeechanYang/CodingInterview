package Chapter1;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-23.
 */
public class Chapter1_6Test {
    private static Problem1_6 p6;

    @BeforeClass
    public static void makeInstance() throws Exception {
        p6 = new Problem1_6();
    }

    @Test
    public void getCompressedStringTest() {
        assertEquals("abccc", p6.getCompressedString2("abccc"));
        assertEquals("a1b1c4", p6.getCompressedString2("abcccc"));
        assertEquals("abc", p6.getCompressedString2("abc"));
        assertEquals("a2b1c5a3", p6.getCompressedString2("aabcccccaaa"));
    }
}
