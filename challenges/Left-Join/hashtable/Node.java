package hashtable;

public
class Node <T> {
    public T key;
    public T value;
    public Node next;

    public Node( T key,T val, Node next){
        this.key=  key;
        this.value=val;
        this.next=next;
    }
}
