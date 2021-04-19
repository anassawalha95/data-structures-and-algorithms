package stacksandqueues;

public class Queue<Q> {

    Node<Q> front;
    Node<Q> back;

    public void enqueue(Q value) {

        if (front == null) {
            front = new Node<Q>(value, back);
            back = front;
        }else{
            back=new Node<>(value,back);
        }
    }

    public Q dequeue() throws NullPointerException{
        Q value;
        if(front==null){
            back=null;
            throw new NullPointerException("Queue is Empty");

        }else {
            value=front.value;
            peek();
            front=front.next;
            return value;
        }
    }


    public String  peek()  throws  NullPointerException{
        if(front==null){
            throw new NullPointerException("Queue is Empty");
        }else {
            String formattedPrint=String.format("Front is %s  ", front.value);
            System.out.println( formattedPrint);
            return formattedPrint;
        }
    }

    public boolean isEmpty(){
        return front==null?true:false;
    }
}
