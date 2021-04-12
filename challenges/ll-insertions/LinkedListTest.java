
package fundamentals;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest{
    @Test public void testLinkedList() throws Exception{
        LinkedList linkedList=new LinkedList();
        Node one= new Node(1);
        linkedList.insert(one);

        Node two= new Node(2);

        linkedList.insert(two);

        Node three= new Node(3);

        linkedList.insert(three);
        assertEquals(  "{ 3 } -> { 2 } -> { 1 } -> Null",linkedList.toString());

        linkedList.append(4);
        assertEquals(  "{ 3 } -> { 2 } -> { 1 } -> { 4 } -> Null",linkedList.toString());

        linkedList.insertBefore(1,5);
        assertEquals(  "{ 3 } -> { 2 } -> { 5 } -> { 1 } -> { 4 } -> Null",linkedList.toString());

        linkedList.insertAfter(5,10);
        assertEquals(  "{ 3 } -> { 2 } -> { 5 } -> { 10 } -> { 1 } -> { 4 } -> Null",linkedList.toString());







        assertEquals(  "expected false, true is given",false,linkedList.includes(15));

        assertEquals(  "expected true, false is given",true,linkedList.includes(3));


    }
}
