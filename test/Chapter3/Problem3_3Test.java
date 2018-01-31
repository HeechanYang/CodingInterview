package Chapter3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-22.
 */
public class Problem3_3Test {
    @Test
    public void SetOfStacksTest() {
        SetOfStacks setOfStacks = new SetOfStacks();
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);

        assertEquals(3, setOfStacks.size());
        assertEquals(0, setOfStacks.getCurrentStackNum());
        assertEquals(Integer.valueOf(3), setOfStacks.peek());
        assertEquals(Integer.valueOf(3), setOfStacks.pop());

        setOfStacks.push(4);
        setOfStacks.push(5);
        setOfStacks.push(6);
        setOfStacks.push(7);
        setOfStacks.push(8);
        setOfStacks.push(9);
        setOfStacks.push(10);
        setOfStacks.push(11);
        setOfStacks.push(12);

        assertEquals(Integer.valueOf(12), setOfStacks.peek());
        assertEquals(11, setOfStacks.size());
        assertEquals(1, setOfStacks.getCurrentStackNum());
        assertEquals(Integer.valueOf(12), setOfStacks.pop());
        assertEquals(10, setOfStacks.size());
    }

}
