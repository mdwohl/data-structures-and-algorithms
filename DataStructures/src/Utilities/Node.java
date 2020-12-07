package Utilities;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    public Node<T> left;
    public Node<T> right;
    public T value;
    private List<Node<T>> children = new ArrayList<>();

    public Node(T value){
        this.left = null;
        this.right = null;
        this.value = value;
    }

    public boolean addNodeChild(Node<T> child){
        return this.children.add(child);
    }

    public List<Node<T>> getChildren(){
        return children;
    }

    public T getValue(){
        return value;
    }

    public String toString(){
        return "values: " + value + "right: " + left + "left: ";
    }
}

