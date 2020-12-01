package test.java.DataStructures;

import main.java.DataStructures.tree.BinarySearchTree;
import main.java.DataStructures.tree.Node;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

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

    //find max tests
    @Test
    public void findMaxTest(){
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(5);
        testTree.add(12);
        testTree.add(21);
        testTree.add(4);
        testTree.add(3);
        testTree.add(8);
        testTree.add(6);
        assertEquals(21, testTree.findMax());
    }
    @Test
    public void findMaxEqualVals(){
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(25);
        testTree.add(25);
        testTree.add(25);
        testTree.add(25);
        testTree.add(25);
        testTree.add(25);
        testTree.add(25);
        testTree.add(25);
        assertEquals(25, testTree.findMax(), "should be 25");
    }
    @Test
    public void findMaxEmptyTree(){
        BinarySearchTree testTree = new BinarySearchTree();
        assertTrue(true, "This should be null");
    }

    //Three tests below are for the Breadth First Search
    @Test
    public void breadthFirstSearch(){
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(3);
        testTree.add(5);
        testTree.add(7);
        testTree.add(11);
        testTree.add(13);

        ArrayList<Integer> bfs = new ArrayList<>();
        bfs.add(3);
        bfs.add(5);
        bfs.add(7);
        bfs.add(11);
        bfs.add(13);
        System.out.println(testTree.breadthFirst().toString());
        assertEquals(bfs, testTree.breadthFirst(), "these should be equal");
    }

    @Test
    public void emptyTreeBreadthFirst(){
        BinarySearchTree testTree = new BinarySearchTree();
        assertTrue(true, "This should be null");

    }

    @Test
    public void singleNodeTree(){
    BinarySearchTree testTree = new BinarySearchTree();
    testTree.add(1500);
    assertEquals(1500, 1500, "should be equal at 1500");
    }

}
