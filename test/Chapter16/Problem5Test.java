package Chapter16;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by YangHC on 2018-01-06.
 */
public class Problem5Test {
    @Test
    public void testFindLastZeros(){
        Problem5 p5 = new Problem5();
        assertEquals("LastZero",p5.findLastZeros(124000), 3);
    }

    @Test
    public void testFactorialN(){
        Problem5 p5 = new Problem5();
        assertEquals("Factorial n", p5.factorialN(5), 120);
    }
}
