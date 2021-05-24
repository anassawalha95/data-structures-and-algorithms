package treeintersection;

import TreeIntersectionTest.TreeIntersection;
import org.junit.Test;
import tree.BinarySearchTree;
import tree.Node;

import static org.junit.Assert.assertArrayEquals;

public
class AppTest {
    @Test
    public void TreeIntersectionTest()  {


        Node root1 = new Node(50);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(31);
        root1.right.left = new Node(6);
        root1.right.right = new Node(9);
        BinarySearchTree binarySearchTree1=new BinarySearchTree(root1);


        Node root2 = new Node(150);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(100);
        root2.right.left = new Node(6);
        root2.right.right = new Node(7);
        BinarySearchTree binarySearchTree2=new BinarySearchTree(root2);

        assertArrayEquals(new Integer[]{2, 3, 4, 6}, TreeIntersection.tree_intersection(binarySearchTree1,binarySearchTree2) );

        BinarySearchTree binarySearchTree3=new BinarySearchTree(null);
        BinarySearchTree binarySearchTree4=new BinarySearchTree(null);
        assertArrayEquals(new Integer[]{}, TreeIntersection.tree_intersection(binarySearchTree3,binarySearchTree4) );

        BinarySearchTree binarySearchTree5=new BinarySearchTree(root1);
        BinarySearchTree binarySearchTree6=new BinarySearchTree(null);
        assertArrayEquals(new Integer[]{}, TreeIntersection.tree_intersection(binarySearchTree5,binarySearchTree6) );

        BinarySearchTree binarySearchTree7=new BinarySearchTree(null);
        BinarySearchTree binarySearchTree8=new BinarySearchTree(root2);
        assertArrayEquals(new Integer[]{}, TreeIntersection.tree_intersection(binarySearchTree7,binarySearchTree8) );

        //    System.out.println(Arrays.toString(TreeIntersection.tree_intersection(binarySearchTree1,binarySearchTree2)));



    }
}
