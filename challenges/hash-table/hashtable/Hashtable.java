package hashtable;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public
class Hashtable {
    Node<Node>[] hashTable;

    Hashtable(){
        hashTable=new Node[100];
    }
    public int hash(String key){

        int keyGenerated = 0;
        for (int i = 0; i < key.length(); i ++) {
            int ascii = (int)  key.charAt(i);
            keyGenerated += ascii;
        }
        return keyGenerated * 599 % hashTable.length;


    }




    public boolean add(String key,String value ){

        int keyIndex=hash(key);
        Node curr =hashTable[keyIndex];
        Node node =new Node(key,value,null);
        Node pre=null;
        if(curr !=null ){
            while (curr!=null){

                if ( curr.key==key){
                    return false;
                }
                if (curr.next==null)
                    pre=curr;

                curr=curr.next;
            }


            pre.next=node;


        }else{

            hashTable[keyIndex]=node;
        }


        return true;
    }

    public String get(String key){

        int keyIndex=hash(key);

        if(hashTable[keyIndex] !=null ){
            Node curr =hashTable[keyIndex];

            while (curr!= null) {
                if (curr.key==key){
                        return (String) curr.value;
                }
                    curr = curr.next;
            }

        }

        return null ;
    }


    public boolean contains(String key) {
        int keyIndex = hash(key);

        if (hashTable[keyIndex] != null) {
            Node curr = hashTable[keyIndex];
            while (curr != null) {
                if (curr.key == key)
                    return true;
                curr = curr.next;
            }



        }
        return false;


    }

    @Override
    public
    String toString() {
        StringBuilder text=new StringBuilder();
        text.append("[");
        text.append("\n");
        for(int i=0;i<hashTable.length;i++){
            if (hashTable[i]!=null){
                text.append("   "+i);
                text.append(" --> ");
                Node head=hashTable[i];
                while(head !=null){
                    text.append("{ ");
                    text.append(head.key);
                    text.append(" : ");
                    text.append(head.value);
                    text.append(" } ");
                    text.append(" , ");
                    head=head.next;
                }
                text.append("\n");
            }

        }
        text.append("]");
        return text.toString();
    }

    public static void main(String[] args)    {

        Hashtable hashtable=new Hashtable();
        hashtable.add("anas","sawalha");
        hashtable.add("ahmad","sawalha");
        hashtable.add("hanna","maratoq");
        hashtable.add("hamde","aci");
        hashtable.add("random","someone");
        hashtable.add("random","someone");
        hashtable.add("sheya","chilo");
        hashtable.add("dummy","play");
        hashtable.add("data","datuim");
        hashtable.add("mia","moo");
        hashtable.add("may","mad");

        System.out.println(hashtable.toString());

    }
}
