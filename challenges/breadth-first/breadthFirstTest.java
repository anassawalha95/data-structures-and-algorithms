
package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class AppTest {

 
    @Test
    public void breadthFirstTest() throws Exception {


        BinaryTree binaryTree=new BinaryTree();
        Node root = new Node(150);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(100);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        List listTest=new ArrayList(Arrays.asList(150, 2, 3, 4, 100, 6, 7));
        System.out.println(listTest);
        assertEquals(listTest,binaryTree.breadthFirst(root));
        root.printNodeTree(root,0,5);
    }

}
