package test.java.DataStructures;

import main.StacksAndQueues.Queue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {
    @Test
    public void enqueueTester() throws Exception {
        Queue satsuma = new Queue();
        satsuma.enqueue(9);
        int test = (int) satsuma.peek();
        assertEquals(9,test);
    }

    @Test
    public void bunchOfEnqueues() throws Exception{
        Queue satsuma = new Queue();
        satsuma.enqueue(3);
        satsuma.enqueue(5);
        satsuma.enqueue(7);
        satsuma.enqueue(11);

        assertEquals(3, satsuma.peek());
        assertEquals(satsuma.isEmpty(), false);
    }

    @Test
    public void dequeueEmptyTester() throws Exception{
        Queue satsuma = new Queue();
        satsuma.enqueue(3);
        satsuma.enqueue(5);
        satsuma.enqueue(7);
        satsuma.enqueue(11);
        satsuma.dequeue();
        satsuma.dequeue();
        satsuma.dequeue();
        satsuma.dequeue();
        assertEquals(true,satsuma.isEmpty());
    }

    @Test
    public void peekyTester() throws Exception{
        Queue satsuma = new Queue();
        satsuma.enqueue(3);
        satsuma.enqueue(5);
        satsuma.enqueue(7);
        satsuma.enqueue(11);
        assertEquals(3,satsuma.peek());
    }

    @Test
    public void isEmptyTest() throws Exception{
        Queue satsuma = new Queue();
        assertEquals(true, satsuma.isEmpty());
    }
}
