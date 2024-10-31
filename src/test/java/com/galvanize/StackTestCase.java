package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.galvanize.Stack;
import com.galvanize.Node;

class StackTestCase {
    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(new Node(100));
        assertFalse(stack.isEmpty());
    }

    @Test
    void testCount() {
        assertEquals(0, stack.count());
        stack.push(new Node(100));
        assertEquals(1, stack.count());
        stack.push(new Node(200));
        stack.push(new Node(300));
        assertEquals(3, stack.count());
    }

    @Test
    void testStackPopRemovesNode_LIFO() {
        stack.push(new Node(200));
        stack.push(new Node(300));
        Node lastIn = new Node(400);
        stack.push(lastIn);

        Node firstOut = stack.pop();
        assertEquals(2, stack.count());
        assertEquals(lastIn, firstOut);
    }

    @Test
    void testStackPeekReturnsTopNode() {
        Node item = new Node(200);
        Node topItem = new Node(300);
        stack.push(item);
        stack.push(topItem);
        Node peekItem = stack.peek();
        assertEquals(topItem, peekItem);
    }
}
