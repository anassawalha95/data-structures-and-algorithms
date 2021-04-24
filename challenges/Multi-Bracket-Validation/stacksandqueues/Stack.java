package stacksandqueues;

public class Stack<S>  {
    Node<S> top;
    public Stack(){}
    public void push(S value){
        top =new Node<S>(value, top);
    }
    public S pop()  {
        S value;
        if(top==null){
            return null;
        }else {
            value=top.value;
            top = top.next;
            return value;
        }


    }
    public S  peek() {
        if(top==null){
         return null;
        }else {
            return top.value;
        }
    }




}
