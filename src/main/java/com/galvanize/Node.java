package com.galvanize;

/*
    Node

    Nodes are the individual units contained in a data structure.

    A node is a value object, representing any type of value and
    providing a reference to the next node.
 */
public class Node {
    private final String value;
    private Node next;

    public Node(String stringValue){
        this.value = stringValue;
    }

    public Node(int intValue){
        this.value = String.valueOf(intValue);
    }

    public void setNext(Node next){
        this.next = next;
    }

    public String getValue(){
        return value;
    }

    public Node getNext(){
        return this.next;
    }

}
