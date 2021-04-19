package stacksandqueues;

public class Stack<N>  {
    Node<N> top;
    Stack(){}
    public void push(N value){

        top =new Node<N>(value, top);

    }
    public N pop() throws NullPointerException {
        N value;
        if(top==null){
            throw new NullPointerException("Stack is Empty");
        }else {
            peek();
            value=top.value;
            top = top.next;
            return value;
        }


    }
    public String  peek()  throws  NullPointerException{
        if(top==null){
            throw new NullPointerException("Stack is Empty");
        }else {
            String formattedPrint=String.format("Top is %s  ", top.value);
            System.out.println( formattedPrint);
            return formattedPrint;
        }
    }

    public boolean isEmpty(){
         return top==null?true:false;
    }
}
