package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<BT> {


    public List preOrder(Node<BT> root) throws Exception {
        List preOrder = new ArrayList<>();
        return preOrderHandler(root, preOrder);
    }

    private List preOrderHandler(Node<BT> root, List preOrder) throws Exception {

        preOrder.add(root.value);
        if (root.left != null)
            preOrderHandler(root.left, preOrder);
        if (root.right != null)
            preOrderHandler(root.right, preOrder);
        return preOrder;
    }

    public List inOrder(Node<BT> root) throws Exception {
        List inOrder = new ArrayList<>();

        return inOrderHandler(root, inOrder);

    }

    private List inOrderHandler(Node<BT> root, List inOrder) throws Exception {

        if (root.left != null)
            inOrderHandler(root.left, inOrder);

        inOrder.add(root.value);

        if (root.right != null)
            inOrderHandler(root.right, inOrder);

        return inOrder;
    }


    public List postOrder(Node<BT> root) throws Exception {
        List postOrder = new ArrayList<>();

        return postOrderHandler(root, postOrder);
    }


    private List postOrderHandler(Node<BT> root, List postOrder) throws Exception {

        if (root.left != null)
            postOrderHandler(root.left, postOrder);


        if (root.right != null)
            postOrderHandler(root.right, postOrder);

        postOrder.add(root.value);

        return postOrder;
    }

    public Integer findMaximumValue(Node<BT> root) {
        Integer maxValue =  0;
        return findMaximumValueHandler(root, maxValue);

    }

    public Integer findMaximumValueHandler(Node<BT> root, Integer maxValue) {


        if (((Integer) root.value) > maxValue) {
            maxValue = ((Integer)root.value);
        }

        if (root.left != null)
            maxValue=  findMaximumValueHandler(root.left, maxValue);

        if (root.right != null) {
            maxValue=   findMaximumValueHandler(root.right, maxValue);
        }

        return maxValue;

    }
}