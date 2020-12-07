package main.java.DataStructures.tree;

//thanks to Chandler for help with this


public class Tree<S> {
    public Node root;
    public Tree(){}

    public Tree<S> createTheTree(){
        Tree<S> tree1 = new Tree<S>();
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
