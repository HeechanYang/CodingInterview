package Chapter3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-22.
 */
public class Problem3_5Test {
    private static SortedStack sortedStack;

    @Before
    public void makeInstance() throws Exception {
        sortedStack = new SortedStack();
    }

    @Test
    public void SortedStackTest(){
        sortedStack.push(1);
        sortedStack.push(3);
        sortedStack.push(2);
        sortedStack.push(7);
        sortedStack.push(5);
        sortedStack.push(5);
        assertEquals(Integer.valueOf(1),sortedStack.pop());
        assertEquals(Integer.valueOf(2),sortedStack.pop());
        assertEquals(Integer.valueOf(3),sortedStack.pop());
        assertEquals(Integer.valueOf(5),sortedStack.pop());
        assertEquals(Integer.valueOf(5),sortedStack.pop());
        assertEquals(Integer.valueOf(7),sortedStack.pop());
    }

}
