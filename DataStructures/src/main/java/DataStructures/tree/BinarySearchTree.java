package main.java.DataStructures.tree;

import javax.sound.midi.Soundbank;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
    }

    //below will add to tree
    public void add(int data) {
        root = recur(root, data);
    }

    private Node recur(Node current, int data) {
        if (current == null) {
            return new Node(data);}
            if (data < current.value) {
                current.left = recur(current.left, data);
            } else if (data > current.value) {
                current.right = recur(current.right, data);
            } else {
                return current;
            }
            return current;
        }

    public boolean contains(Node current, int data) {
        if (current == null)
            return false;

        if (data == current.value)
            return true;
        return data < current.value
                ? contains(current.left, data) : contains(current.right, data);
    }

    //below are three depth first searches
    //preorder
    public ArrayList<Integer> preorder (Node node){
        ArrayList<Integer> preorderArray = new ArrayList<>();
        return preorderUtil(preorderArray, node);
    }
    private ArrayList<Integer> preorderUtil(ArrayList<Integer> preorderArray, Node node){
        if (node != null){
            preorderArray.add(node.value);
            preorderUtil(preorderArray, node.left);
            preorderUtil(preorderArray, node.right);
        }
        return preorderArray;
    }
    //postorder
    public ArrayList<Integer> postorder (Node node){
        ArrayList<Integer> postorderArray = new ArrayList<>();
        return postorderUtil(postorderArray, node);
    }

    private ArrayList<Integer> postorderUtil(ArrayList<Integer> postorderArray, Node node) {
        if (node != null) {
            postorderUtil(postorderArray, node.left);
            postorderUtil(postorderArray, node.right);
            postorderArray.add(node.value);
        }
        return postorderArray;
    }
    //inorder
    public ArrayList<Integer> inorder (Node node) {
        ArrayList<Integer> inorderArray = new ArrayList<>();
        return inorderUtil(inorderArray, node);
    }
    private ArrayList<Integer> inorderUtil(ArrayList<Integer> inorderArray, Node node){
        if (node != null){
            inorderUtil(inorderArray, node.left);
            inorderArray.add(node.value);
            inorderUtil(inorderArray, node.right);
        }
        return inorderArray;
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
