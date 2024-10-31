package com.galvanize;

import com.galvanize.Node;
import com.galvanize.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTestCase {
    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue();
    }

    @Test
    void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.enqueue(new Node(100));
        assertFalse(queue.isEmpty());
    }

    @Test
    void testLength() {
        assertEquals(0, queue.length());
        queue.enqueue(new Node(100));
        assertEquals(1, queue.length());
        queue.enqueue(new Node(200));
        queue.enqueue(new Node(300));
        assertEquals(3, queue.length());
    }

    @Test
    void testEnqueueManyNodes_FIFO() {
        Node firstNode = new Node("A");
        queue.enqueue(firstNode);
        queue.enqueue(new Node("B"));
        queue.enqueue(new Node("C"));
        assertEquals(firstNode, queue.getFront());
        assertEquals("C", queue.getRear().getValue());
    }

    @Test
    void testDequeueOneNode_FIFO() {
        Node firstIn = new Node("A");
        Node secondIn = new Node("B");
        queue.enqueue(firstIn);
        queue.enqueue(secondIn);
        queue.enqueue(new Node("C"));
        Node firstOut = queue.dequeue();
        assertEquals(2, queue.length());
        assertEquals(firstIn, firstOut);
        assertEquals(secondIn, queue.getFront());
    }
}
