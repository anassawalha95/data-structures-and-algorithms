package tree;

public class Node<N> {

    N value;
    Node<N> left;
    Node<N> right;

    public Node(N value) {
        this.value = value;
    }

    public Node(N value, Node<N> left, Node<N> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void printNodeTree(Node<N> node,int space  , int height ){
        if (node==null)
        return;

        space += height;
        printNodeTree(node.right, space, height);
        System.out.println();
        for (int i = height; i < space; i++) {
            System.out.print(" ");
        }
        System.out.print(node.value);
        System.out.println();
        printNodeTree(node.left, space, height);
    }


}
