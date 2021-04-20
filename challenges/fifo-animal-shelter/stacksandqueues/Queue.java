package stacksandqueues;

public class Queue<Q> {

    Node<Q> front;
    Node<Q> back;



    public void enqueue(Q value) {

        if (front == null) {
            front = new Node<Q>(value, null);
            back = front;
        }else{
            Node<Q> newNode=new Node<Q>(value, null);
            back.next=newNode;
            back=newNode;
        }
    }

    public Q dequeue() throws NullPointerException{
        if(back==null){

            throw new NullPointerException("Queue is Empty");
        }
        Q value = front.value;
        front = front.next;
        if(front == null) {
            this.back = null;
        }
        return value;
    }


    public String  peek()  throws  NullPointerException{
        if(front==null){
            throw new NullPointerException("Queue is Empty");
        }else {
            String formattedPrint=String.format("%s", front.value);
         //   System.out.println( formattedPrint);
            return formattedPrint;
        }
    }

    public boolean isEmpty(){
        return front==null?true:false;
    }
}
