package LeftJoin;

import hashtable.Hashtable;
import hashtable.Node;

import java.util.ArrayList;
import java.util.List;

public
class LeftJoin {

    public List<String[]> joinedHashes;
    @Override
    public
    String toString() {
        StringBuilder text= new StringBuilder();
        text.append("[");
        int counter =1;
        for(String[] s : joinedHashes){
            text.append("[");

            for (String value: s){
                if(counter !=3) {
                    text.append(value + ", ");
                    counter++;
                }
                else{
                    text.append(value);
                }

            }
            counter=1;
            text.append("]");
        }
        text.append("]");
        return text.toString();
    }

    LeftJoin(){

        this.joinedHashes=new ArrayList<>();
    }
    public
    List<String[]> join2HashTables(Hashtable hashtable1, Hashtable hashtable2){

        this.joinedHashes=new ArrayList<>();
            for(Node idx:  hashtable1.hashTable){
                while (idx!=null){

                    joinedHashes.add(new String[]{(String) idx.key,(String) idx.value,hashtable2.get((String) idx.key)});
                    idx=idx.next;
                }
            }

        return joinedHashes;
    }


}
