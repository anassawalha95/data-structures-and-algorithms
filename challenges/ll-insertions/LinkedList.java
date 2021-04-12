package fundamentals;
public class LinkedList {

    Node head;


    public boolean insert  (Node newNode){
        try {
            if(head==null){
                head=newNode;
                return true;
            }
            newNode.next= head;
            head=newNode;
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }


    }

    public boolean includes(int val) throws Exception{
        Node current= head;

        while(current !=null){
            if (current.value==val)
                return true;
            current= current.next;
        }
        return false;
    }

    public void append(int val){


            Node current = head;
            Node newNode = new Node(val);

            if(head==null){
                head=newNode;
                return;
            }
            while (current.next != null) {
                current=current.next;
            }
            current.next = newNode;
    }

    public void insertBefore(int value, int newVal){


        Node current = head;
        Node newNode = new Node(newVal);

        if(head==null){
            head=newNode;
            return;
        }


        while (current != null) {


            if(current.next.value== value){
                newNode.next=current.next;
                current.next=newNode;
                break;
            }
            current=current.next;
        }

    }

    public void insertAfter(int value,int newVal){
        Node current = head;
        Node newNode = new Node(newVal);

        if(head==null){
            head=newNode;
            return;
        }


        while (current != null) {


            if(current.value== value){
                newNode.next=current.next;
                current.next=newNode;
                break;
            }
            current=current.next;
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

 public static void main(String[] args) throws Exception {
        LinkedList linkedList=new LinkedList();
        Node one= new Node(1);
        linkedList.insert(one);

        Node two= new Node(2);

        linkedList.insert(two);

        Node three= new Node(3);

        linkedList.insert(three);

        linkedList.append(4);
        System.out.println(linkedList.toString());

       linkedList.insertBefore(1,5);
        System.out.println(linkedList.toString());

      linkedList.insertAfter(5,10);
        System.out.println(linkedList.toString());

        System.out.println(linkedList.toString());
        System.out.println(linkedList.includes(4));
    }

}
