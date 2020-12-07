package test.java.DataStructures;

import main.StacksAndQueues.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
    @Test
    public void testPush() throws Exception{
        Stack test = new Stack();
        test.push(7);
        int result = (int) test.peek();
        assertEquals(7, result);
    }

    @Test
    public void pushABunch() throws Exception{
        Stack test = new Stack();
        test.push(3);
        test.push(5);
        test.push(7);
        test.push(11);

        assertEquals(11, test.peek());
        assertEquals(test.isEmpty(), false);
    }

    @Test
    public void emptyTester() throws Exception{
        Stack test = new Stack();
        assertEquals(true, test.isEmpty());
    }

    @Test
    public void peekTest() throws Exception{
        Stack test = new Stack();
        test.push(21);
        test.push(680);
        test.push(9);
        assertEquals(9, test.peek());
    }

    @Test
    public void emptyPoppyTest() throws Exception{
        Stack test = new Stack();
        test.push(21);
        test.pop();
        assertEquals(true, test.isEmpty());
    }
}
