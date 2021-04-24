class Node {

  int value;
  Node next;

  public Node( int value) {
    this.value=value;
  }
}
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

        System.out.println(linkedList.toString());
        System.out.println(linkedList.includes(4));
    }

}
