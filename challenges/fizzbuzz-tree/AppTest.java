package utilities.App;

import org.junit.Test;
import utilities.*;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class AppTest {

       @Test
    public void fizzBuzzTest() {

        ArrayList<Node> children1 = new ArrayList<>();
        ArrayList<Node> children2 = new ArrayList<>();
        ArrayList<Node> children3 = new ArrayList<>();
        Node root = new Node(1);


        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(50);
        Node node6 = new Node(60);
        Node node7 = new Node(70);
        Node node8 = new Node(90);
        Node node9 = new Node(100);
        Node node10 = new Node(150);


        children1.add(node1);
        children1.add(node2);
        children1.add(node3);
        children1.add(node4);
        children1.add(node5);

        root.children = children1;

        children2.add(node6);
        children2.add(node7);
        children2.add(node8);

        node1.children = children2;

        children3.add(node9);
        children3.add(node10);

        node3.children = children3;

        FizzBuzzTree fizzBuzz = new FizzBuzzTree();

        Node tree = fizzBuzz.FizzBuzzTree(root);
        StringBuilder str = new StringBuilder();
        assertEquals("1" +
                "   2" +
                "      FizzBuzz" +
                "      Buzz" +
                "      FizzBuzz" +
                "   Fizz" +
                "   4" +
                "      Buzz" +
                "      FizzBuzz" +
                "   Buzz" +
                "   Buzz",tree.printNodeTree(tree, 0,str));



    }
}
