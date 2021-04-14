package fundamentals;
public class LinkedList<N> {
    Node<N> head;
    Node<N> tail;
    int nodesCounter=0;

    public void insert  (N value){
        this.head=new Node(value,this.head);
        tail=head;
        this.nodesCounter++;
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
                insert(value);
                return;
            }
            while (current.next != null ) {
                current = current.next;
            }
            this.nodesCounter++;
            current.next = new Node<N>(value,current.next);
            tail=  current.next;
    }

    public void insertBefore(N value, N newVal){
        Node<N> current = head;
        Node<N>  nNode;
        if(current ==null || current.next == null){
            insert(newVal);
        }else {
            while (true) {
            if(current.next == null){
                nNode =new Node<>(newVal,null);
                nNode.next=current.next;
                current.next=nNode;
                this.nodesCounter++;
                break;
            }else if(current.next.value.equals(value)){
                nNode =new Node<>(newVal,null);
                nNode.next=current.next;
                current.next=nNode;
                this.nodesCounter++;
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
            insert(newVal);

        } else if (current.next == null) {
            append(newVal);
        } else {
            while (current != null) {
                if (current.value == value) {
                    nNode= new Node<>(newVal,null);
                    nNode.next = current.next;
                    current.next = nNode;
                    this.nodesCounter++;
                    break;
                }
                current = current.next;
            }
        }
    }

    public String kthFromEnd(int k){
        Node<N> current = head;
        int tempNodesCounter=this.nodesCounter;

        if(head==null){ //check if the linked list is empty or not
            return "The list is empty";
        }
        if (k > this.nodesCounter )
            return "The provided index is Greater than the list length";
        if (k == this.nodesCounter ) //check if the linked list is equal to 1 or only has 1 element inside
            return String.format("The value is %s", current.value);
        if (k == 0 )
            return String.format("The value is %s", this.tail.value);
        if (k < 0 )
            return String.format("The provided index %s must be positive number", k);

        while (current != null) {
            if (k == tempNodesCounter-1) {
                break;
            }
            --tempNodesCounter;
            current = current.next;
        }
        return String.format("The value is %s", current.value);
    }


    public LinkedList zipLists(LinkedList listOne, LinkedList listTwo ){

        Node<N> currentListOne = listOne.head;
        Node<N> currentListTwo = listTwo.head;
        if (listOne.head == null && listTwo.head == null){
           return null;
        }
        if (listOne.head == null && listTwo.head != null){
            //listOne.head =  listTwo.head;
            head=listTwo.head;
            return listTwo ;
        }
        if (listTwo.head == null  && listOne.head != null){
            head=listOne.head;
            return listOne ;
        }
        while ( currentListOne != null ){
            currentListOne = currentListOne.next;
        }
        while ( currentListTwo != null ){

            listOne.append(currentListTwo.value);
            currentListTwo=currentListTwo.next;
        }
//
//        listOne.append(listTwo.head);
        head=listOne.head;
        return listOne;
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
