package com.galvanize;

import com.galvanize.LinkedList;
import com.galvanize.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTestCase {
    LinkedList linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList();
    }

    @Test
    void testIsEmpty() {
        assertTrue(linkedList.isEmpty());
        linkedList.addNode(new Node(100));
        assertFalse(linkedList.isEmpty());
    }

    @Test
    void testGetHead() {
        Node node = new Node("Sword");
        linkedList.addNode(node);
        assertEquals(node, linkedList.getHead());
    }

    @Test
    void testCount() {
        assertEquals(0, linkedList.count());
        linkedList.addNode(new Node(100));
        assertEquals(1, linkedList.count());
        linkedList.addNode(new Node(200));
        linkedList.addNode(new Node(300));
        assertEquals(3, linkedList.count());
    }

    @Test
    void testFindNode() {
        Node aNode = new Node("A");
        Node bNode = new Node("B");
        linkedList.addNode(aNode);
        linkedList.addNode(bNode);
        Node result = linkedList.find(aNode);
        assertEquals(aNode, result);
    }

    @Test
    void testRemoveNodeSuccess() {
        Node aNode = new Node("A");
        Node bNode = new Node("B");
        Node cNode = new Node("C");
        Node dNode = new Node("D");
        linkedList.addNode(aNode);
        linkedList.addNode(bNode);
        linkedList.addNode(cNode);
        linkedList.addNode(dNode);
        linkedList.removeNode(cNode);
        assertEquals(3, linkedList.count());
        assertEquals(bNode.getNext(), dNode);
    }
}
