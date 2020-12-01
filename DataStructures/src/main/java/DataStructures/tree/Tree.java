package main.java.DataStructures.tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//thanks to Chandler for help with this


public class Tree {
    public Node root;
    public Tree(){}

    public Tree createTheTree(){
        Tree tree1 = new Tree();
        tree1.add(3);
        tree1.add(5);
        tree1.add(7);
        tree1.add(11);
        tree1.add(13);
        tree1.add(17);
        tree1.add(19);
        return tree1;
    }

    //function for adding to tree
    public void add(int value){
        root = addRecur(root, value);
    }

    private Node addRecur(Node current, int value){
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecur(current.left, value);
        } else if (value > current.value) {
            current.right = addRecur(current.right, value);
        } else {
            return current;
        }
        return current;
    }
}
