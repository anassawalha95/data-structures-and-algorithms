package tree;

public class BinarySearchTree<BTS> {
    private Node <Integer> root;

    BinarySearchTree(Node <Integer> root){
        this.root=root;
    }
    public Node <Integer> add(Integer  value){

        this.root=  addNewNode(this.root,value);

        return  this.root;
    }

    private Node<Integer> addNewNode(Node <Integer> root, Integer  value){

        if (root == null) {
            return new Node<Integer>(value);
        }
        if (value < root.value) {
            root.left = addNewNode(root.left, value);
        } else if (value > root.value) {
            root.right = addNewNode(root.right, value);
        } else {
            return root;
        }
        return root;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public boolean  contains (Integer  value){
        Node <Integer> current = root;
        while (current !=null){
            if(current.value == value){
                return true;
            }
            else if (value < current.value) {
                current = current.left;
            }
            else if (value > current.value) {
                current = current.right;
            }
        }

        return false;
    }

}
