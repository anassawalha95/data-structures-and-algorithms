package stacksandqueues;
public class Node<T> {
    T value;
    Node next;

    Node(T val,Node next){
        this.value=val;
        this.next=next;
    }
}
