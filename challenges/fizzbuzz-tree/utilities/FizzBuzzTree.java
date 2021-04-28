package utilities;

import stacksandqueues.Queue;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzTree<FBT> {

    public Node FizzBuzzTree(Node<FBT> oldTreeRoot) {

        Node<FBT> newTreeRoot = new Node<FBT>(null);
        Node<FBT> temp = newTreeRoot;

        Queue<Node> breadth = new Queue();
        boolean flag = true;
        breadth.enqueue(oldTreeRoot);

        while (!breadth.isEmpty()) {

            Node<FBT> front = breadth.dequeue();


            if ((Integer) front.value % 3 == 0 && (Integer) front.value % 5 == 0) {

                front.value = (FBT) "FizzBuzz";
                newTreeRoot = front;

            } else if ((Integer) front.value % 3 == 0) {

                front.value = (FBT) "Fizz";
                newTreeRoot = front;

            } else if ((Integer) front.value % 5 == 0) {

                front.value = (FBT) "Buzz";
                newTreeRoot = front;

            } else {
                newTreeRoot = front;

            }

            if (front.children != null)
                for (Node<FBT> child : front.children) {
                    breadth.enqueue(child);
                }

            if (flag == true) {
                temp = newTreeRoot;
                flag = false;
            }
        }

        return temp;
    }

    public static void main(String[] args) throws Exception {

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

        FizzBuzzTree f = new FizzBuzzTree();

        Node tree = f.FizzBuzzTree(root);

        StringBuilder str = new StringBuilder();
        tree.printNodeTree(tree, 0,str);

    }
}
