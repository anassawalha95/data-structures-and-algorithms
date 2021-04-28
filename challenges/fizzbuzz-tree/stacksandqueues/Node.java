package stacksandqueues;
public class Node<T> {
    public T value;
    public Node next;

    public Node(T val, Node next){
        this.value=val;
        this.next=next;
    }
}
