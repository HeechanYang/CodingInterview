package Chapter16;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-06.
 */
public class Problem8Test {
    private static Problem8 p8;

    @BeforeClass
    public static void makeInstance()throws Exception {
        p8 = new Problem8();
    }

    @Test
    public void devideNumber(){
        assertEquals(100,p8.getDevidedNumbers(100)[0]);
        assertEquals(1,p8.getDevidedNumbers(2001)[0]);
        assertEquals(2,p8.getDevidedNumbers(2001)[1]);
        assertEquals(456,p8.getDevidedNumbers(123456)[0]);
        assertEquals(123,p8.getDevidedNumbers(123456)[1]);
    }

    @Test
    public void getDevideCountOfNumber(){
        assertEquals(1,p8.getCountOfDevidedNumber(100));
        assertEquals(2,p8.getCountOfDevidedNumber(1000));
        assertEquals(2,p8.getCountOfDevidedNumber(10000));
        assertEquals(3,p8.getCountOfDevidedNumber(1000000));
        assertEquals(3,p8.getCountOfDevidedNumber(10000000));
        assertEquals(3,p8.getCountOfDevidedNumber(123456789));
    }


    @Test
    public void makeStringDevidedNumber(){
        assertEquals("",p8.makeStringDevidedNumber(0));
        assertEquals("One Hundred",p8.makeStringDevidedNumber(100));
        assertEquals("Two Hundred",p8.makeStringDevidedNumber(200));
        assertEquals("Three Hundred Twenty Three",p8.makeStringDevidedNumber(323));
    }
}
