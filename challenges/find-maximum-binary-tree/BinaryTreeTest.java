
package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class AppTest {

    @Test
    public void BinaryTreePreOrderTest() throws Exception {

        BinaryTree binaryTree=new BinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(1000);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        List list=new ArrayList(Arrays.asList(1, 2, 4, 5, 3, 6, 7));
        assertEquals(list,binaryTree.preOrder(root));



    }
    @Test
    public void BinaryTreeInOrderTest() throws Exception {
        BinaryTree binaryTree=new BinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        List list=new ArrayList(Arrays.asList(4, 2, 5, 1, 6, 3, 7));
        assertEquals(list,binaryTree.inOrder(root));

    }
    @Test
    public void BinaryTreePostOrderTest() throws Exception {
        BinaryTree binaryTree=new BinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        List list=new ArrayList(Arrays.asList(4, 5, 2, 6, 7, 3, 1));
        assertEquals(list,binaryTree.postOrder(root));
    }

    @Test
    public void BinarySearchTreeAddTest() throws Exception {
        Node root = new Node(12);
        root.left = new Node(3);
        root.right = new Node(15);
        root.left.left = new Node(5);
        root.left.right = new Node(9);
        root.right.left = new Node(14);
        root.right.right = new Node(20);
        BinarySearchTree binarySearchTree=new BinarySearchTree(root);
        binarySearchTree.add(50);
        assertEquals(root,binarySearchTree.getRoot());
    }

    @Test
    public void BinarySearchTreeContainsTest() throws Exception {
        Node root = new Node(12);
        root.left = new Node(3);
        root.right = new Node(15);
        root.left.left = new Node(5);
        root.left.right = new Node(9);
        root.right.left = new Node(14);
        root.right.right = new Node(20);
        BinarySearchTree binarySearchTree=new BinarySearchTree(root);
        binarySearchTree.add(50);

        assertTrue(binarySearchTree.contains(3));
        assertFalse(binarySearchTree.contains(600));
    }

    @Test
    public void BinaryTreeFindMaximumValueTest() throws Exception {

        BinaryTree binaryTree=new BinaryTree();
        Node root = new Node(150);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(100);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Integer maxValue= binaryTree.findMaximumValue(root);


        assertEquals(java.util.Optional.of(150),java.util.Optional.of(maxValue));


        root.printNodeTree(root,0,5);
    }

}
