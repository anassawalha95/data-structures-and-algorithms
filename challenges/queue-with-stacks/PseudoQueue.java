package stacksandqueues;
public class PseudoQueue<PQ>  {
    Stack<PQ> stackA;
    Stack<PQ> stackB;
    PseudoQueue(){
        stackA=new Stack<PQ>();
        stackB=new Stack<PQ>();

    }
    public PQ enqueue(PQ value) {
        stackA.push(value);
        return stackA.peek();
    }
    public PQ dequeue() throws NullPointerException{
        PQ firstValue;
        while (stackA.peek() != null){
            stackB.push(stackA.pop());
        }
        firstValue=  stackB.pop();
        while (stackB.peek() != null){
            stackA.push(stackB.pop());
        }
        return firstValue;
    }

}
