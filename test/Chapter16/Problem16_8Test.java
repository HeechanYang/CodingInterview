package Chapter16;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-06.
 */
public class Problem16_8Test {
    private static Problem16_8 p8;

    @BeforeClass
    public static void beforeClassTest()throws Exception {
        p8 = new Problem16_8();
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void afterClassTest()throws Exception {
        p8 = new Problem16_8();
        System.out.println("AfterClass");
    }
    @Before
    public void beforeTest(){
        System.out.println("Before");
    }
    @After
    public void afterTest(){
        System.out.println("After");
    }
    @Test
    public void devideNumber(){
        System.out.println("devideNumberTest");
        assertEquals(100,p8.getDevidedNumbers(100)[0]);
        assertEquals(1,p8.getDevidedNumbers(2001)[0]);
        assertEquals(2,p8.getDevidedNumbers(2001)[1]);
        assertEquals(456,p8.getDevidedNumbers(123456)[0]);
        assertEquals(123,p8.getDevidedNumbers(123456)[1]);
    }
    @Test
    public void getDevideCountOfNumber(){
        System.out.println("getDevideCountOfNumberTest");
        assertEquals(1,p8.getCountOfDevidedNumber(100));
        assertEquals(2,p8.getCountOfDevidedNumber(1000));
        assertEquals(2,p8.getCountOfDevidedNumber(10000));
        assertEquals(3,p8.getCountOfDevidedNumber(1000000));
        assertEquals(3,p8.getCountOfDevidedNumber(10000000));
        assertEquals(3,p8.getCountOfDevidedNumber(123456789));
    }
    @Test
    public void makeStringDevidedNumber(){
        System.out.println("makeStringDevidedNumberTest");
        assertEquals("",p8.makeStringDevidedNumber(0));
        assertEquals("One Hundred",p8.makeStringDevidedNumber(100));
        assertEquals("Two Hundred",p8.makeStringDevidedNumber(200));
        assertEquals("Three Hundred Twenty Three",p8.makeStringDevidedNumber(323));
    }
}
