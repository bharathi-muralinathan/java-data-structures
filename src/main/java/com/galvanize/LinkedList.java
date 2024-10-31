package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/*
  Linked List

  A linked list is a data structure that stores data sequentially by
  linking each item in the list to the next. It has the following properties:

  - head: the first item in the list
  - tail (optional) : last item in the list

  It's made up of items called Nodes, which contain 2 pieces of information:

  - value: any type or you can restrict to specific types
  - next: a reference to the next item in the list

  Nodes are usually added to the end of the list. Operations include:

  - Add node
  - Remove node
  - Find a node
  For example, suppose you have a LinkedList of numbers. It might look
  like so:

  * [] represents the 'value' attribute
  * -> represents the 'next' attribute
  * Together, []-> represents a Node

                    [100]-> [200]-> [300]-> null

  The Node with value 100 is the head. The Node with value 300 is the
  tail. Note how the tail points to nothing. Therefore null signifies
  the end of the list.
 */
public class LinkedList {
    private List<Node> node;

    public LinkedList(){
        this.node = new ArrayList<Node>();
    }


    public boolean isEmpty(){
        if(!node.isEmpty()) {
            return false;
        }
        return true;
    }

    public void addNode(Node node){
        if(this.node.size() > 0 ){
            this.node.get(this.node.size()-1).setNext(node);
        }
        this.node.add(node);


    }

    public Node getHead(){
        return node.get(0);
    }
    public int count(){
        return node.size();
    }

    public Node find(Node node){
        return this.node.get(this.node.indexOf(node));
    }

    public void removeNode(Node node){
        Node nextNode = node.getNext();
        int index = this.node.indexOf(node);
        if(index != 0){
            this.node.get(index - 1).setNext(nextNode);
        }else if(index == this.node.size() -1){
            this.node.get(index - 1).setNext(null);
        }
        this.node.remove(node);
    }
}
