/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fundamentals;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testLinkedList() throws Exception{
        LinkedList linkedList=new LinkedList();

        linkedList.insert(1);


        linkedList.insert(2);



        linkedList.insert(3);
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

@Test public void testLinkedListKthFromEnd(){
        LinkedList linkedList=new LinkedList();

        assertEquals(  "The list is empty",linkedList.kthFromEnd(10));

        linkedList.insert(1);

        assertEquals(  "The value is 1",linkedList.kthFromEnd(0));
        assertEquals(  "The provided index is Greater than the list length",linkedList.kthFromEnd(2));

        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.append(4);
        linkedList.insertBefore(1,5);
        linkedList.insertAfter(5,10);

        assertEquals(  "The value is 4",linkedList.kthFromEnd(0));
        assertEquals(  "The value is 10",linkedList.kthFromEnd(2));
        assertEquals(  "The provided index -5 must be positive number",linkedList.kthFromEnd(-5));
        
    }
}