package test.java.DataStructures;

import main.java.DataStructures.tree.BinarySearchTree;
import main.java.DataStructures.tree.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
//Thanks to Chandler for help with these

public class TreeTest {

    @Test
    public void emptyTreeTest(){
        BinarySearchTree testTree = new BinarySearchTree();
        assertNull(testTree.root);
    }

    @Test
    public void singleRoot(){
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(7);
        assertEquals(7, testTree.root.value);
        assertNull(testTree.root.left);
        assertNull(testTree.root.right);
    }

    @Test
    public void addLeftRight(){
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(7);
        Node left = new Node (9);
        Node right = new Node (5);
        testTree.root.left = left;
        testTree.root.right = right;
        assertEquals(9, testTree.root.left.value);
        assertEquals(5,testTree.root.right.value);
        assertEquals(7, testTree.root.value);
    }

    @Test
    public void preorderTrav(){
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(5);
        testTree.add(12);
        testTree.add(21);
        testTree.add(4);
        testTree.add(3);
        testTree.add(8);
        testTree.add(6);

        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(5);
        testArray.add(4);
        testArray.add(3);
        testArray.add(12);
        testArray.add(8);
        testArray.add(6);
        testArray.add(21);

        assertEquals(testArray,testTree.preorder(testTree.root));
    }

    @Test
    public void inorderTrav(){
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(5);
        testTree.add(12);
        testTree.add(21);
        testTree.add(4);
        testTree.add(3);
        testTree.add(8);
        testTree.add(6);

        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(3);
        testArray.add(4);
        testArray.add(5);
        testArray.add(6);
        testArray.add(8);
        testArray.add(12);
        testArray.add(21);
        assertEquals(testArray,testTree.inorder(testTree.root));

    }
    @Test
    public void postorderTrav(){
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(5);
        testTree.add(12);
        testTree.add(21);
        testTree.add(4);
        testTree.add(3);
        testTree.add(8);
        testTree.add(6);

        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(3);
        testArray.add(4);
        testArray.add(6);
        testArray.add(8);
        testArray.add(21);
        testArray.add(12);
        testArray.add(5);
        assertEquals(testArray,testTree.postorder(testTree.root));


    }
}
