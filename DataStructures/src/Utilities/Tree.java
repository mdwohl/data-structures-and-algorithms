package Utilities;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {
    public Tree(){}
    public Node<T> root;
    public Tree(Node<T> node){
        this.root = node;
    }

    public void setTheRoot(Node<T> root){
        this.root = root;
    }

    public Node<T> getTheRoot(){
        return root;
    }

    public List<Object> inOrder(){
        List<Object> list = new ArrayList<>();
        return inordered(list, this.root);
    }

    private List<Object> inordered(List<Object> list, Node<T> node){
        if(node != null){
            inordered(list, node.left);
            list.add(node.value);
            inordered(list, node.right);
        }
        return list;
    }
}
