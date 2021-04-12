package fundamentals;
public class LinkedList<N> {

    Node<N> head;


    public void insert  (N value){
        this.head=new Node(value,this.head);

    }

    public boolean includes(N value) {
        Node<N> current= this.head;

        while(current !=null){
            if (current.value.equals(value))
                return true;
            current= current.next;
        }
        return false;
    }

    public void append(N value){


            Node<N> current = head;


            if(head==null){
                this.head=new Node(value,this.head);
                return;
            }
            while (current.next != null ) {

                current = current.next;
            }

            current.next = new Node<N>(value,current.next);
    }

    public void insertBefore(N value, N newVal){


        Node<N> current = head;
        Node<N>  nNode;
        if(current ==null){
            this.head=new Node<>(newVal,this.head);

        }else if (current.next == null){
            insert(newVal);

        }else {
            while (true) {

            if(current.next == null){
                nNode =new Node<>(newVal,null);
                nNode.next=current.next;
                current.next=nNode;
                break;
            }else if(current.next.value.equals(value)){
                nNode =new Node<>(newVal,null);
                nNode.next=current.next;
                current.next=nNode;
                break;
            }
            current=current.next;
            }
        }
    }

    public void insertAfter(N value,N newVal) {
        Node<N> current = head;
        Node<N> nNode;

        if (current == null) {
            this.head = new Node<>(newVal, this.head);

        } else if (current.next == null) {
            append(newVal);

        } else {

            while (current != null) {
                if (current.value == value) {
                    nNode= new Node<>(newVal,null);
                    nNode.next = current.next;
                    current.next = nNode;
                    break;
                }
                current = current.next;
            }
        }
    }




    public String toString(){
        Node current= head;
        String text="";

        while(current !=null){
            text += "{ "+ current.value +" }" + " -> " ;
            current= current.next;
        }

        text+="Null";

        return text;

    }

}
