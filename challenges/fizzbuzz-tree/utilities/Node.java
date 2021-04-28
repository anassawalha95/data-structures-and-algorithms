package utilities;

import java.util.ArrayList;

public class Node<N>{
    N value;

    public ArrayList<Node<N>> children =null;

    public Node(N value) {
        this.value = value;
    }

    public Node(N value, ArrayList<Node<N>> children) {
        this.value = value;
        this.children = children;
    }

    public String printNodeTree(Node<N> node, int height ,StringBuilder str ){


        for (int i = 0; i < height; ++i) {
            str.append("   ");
            System.out.print("   ");
        }
        str.append(node.value);
        System.out.println(node.value);
        if( node.children !=null)
        for (Node<N> child : node.children) {
            printNodeTree(child, height + 1,str);
        }
        return str.toString();
    }
}
