package main.java.DataStructures.tree;

public class Node {

    public int value;
    public Node left;
    public Node right;

    public Node(int item){
        this.value = item;
        left = right = null;
    }
}
