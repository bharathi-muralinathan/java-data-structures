package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Node> node;

    public Stack(){
        node = new ArrayList<Node>();
    }

    public boolean isEmpty(){
        if(!node.isEmpty()){
            return false;
        }
        return true;
    }

    public void push(Node node){
        this.node.add(node);
    }

    public int count(){
        return node.size();
    }

    public Node pop(){
        return this.node.remove(node.size()-1);
    }

    public Node peek(){
        return this.node.get(node.size()-1);
    }
}
