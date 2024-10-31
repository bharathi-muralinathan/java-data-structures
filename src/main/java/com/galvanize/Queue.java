package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<Node> node;

    public Queue(){
        this.node = new ArrayList<Node>();
    }

    public boolean isEmpty(){
        if(!node.isEmpty()){
            return false;
        }
        return true;
    }

    public void enqueue(Node node){
        this.node.add(node);
    }

    public int length(){
        return node.size();
    }

    public Node getFront(){
        return node.get(0);
    }

    public Node getRear(){
        return node.get(node.size()-1);
    }

    public Node dequeue(){
        return node.remove(0);
    }



}
