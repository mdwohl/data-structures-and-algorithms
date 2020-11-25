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
    //function for finding the maximum value in tree
    public int findMax(){
        int bigOne = Integer.MIN_VALUE;
        return findMax();
    }
    private int findMaxUtil(Node current, int bigOne){
        if(current == null) return bigOne;
        if(current.value > bigOne)
            bigOne = current.value;
        return current.value > findMax()? findMaxUtil(current.left,bigOne)
                : findMaxUtil(current.right, bigOne);
    }

    public ArrayList breadthFirst(){
        ArrayList<Integer> array = new ArrayList<>();
        Queue<Node> queue = new LinkedList<Node>();
        if(root != null) queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            array.add(node.value);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        return array;
    }
}
