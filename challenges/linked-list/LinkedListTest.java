
package linkedlist;


import org.junit.Test;
import static org.junit.Assert.*;


public class AppTest {
    @Test public void testLinkedList() throws Exception{
        LinkedList linkedList=new LinkedList();
        Node one= new Node(1);
        linkedList.insert(one);

        Node two= new Node(2);

        linkedList.insert(two);

        Node three= new Node(3);

        linkedList.insert(three);

        assertEquals(  "{ 3 } -> { 2 } -> { 1 } -> Null",linkedList.toString());

        assertEquals(  "expected false, true is given",false,linkedList.includes(4));

        assertEquals(  "expected true, false is given",true,linkedList.includes(3));


    }
}
