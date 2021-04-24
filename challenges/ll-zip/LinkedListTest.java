/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fundamentals;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
   
    @Test public void testLinkedListZip(){
       
        LinkedList linkedListCombined=new LinkedList();
        LinkedList linkedList1=new LinkedList();
        LinkedList linkedList2=new LinkedList();

        linkedListCombined= linkedListCombined.zipLists(linkedList1,linkedList2);
        assertEquals("Null",linkedListCombined.toString());
        linkedList1.append(1);
        linkedList2.append(2);

        linkedList1.append(3);
        linkedList2.append(4);

        linkedList1.append(5);
        linkedList2.append(6);

        linkedListCombined= linkedListCombined.zipLists(linkedList1,linkedList2);
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> { 6 } -> Null",linkedListCombined.toString());

        //---------------------------

        linkedList1=new LinkedList();
        linkedList2=new LinkedList();

        linkedList1.append(1);
        linkedList2.append(2);

        linkedList1.append(3);
        //linkedList2.append(4);

        linkedList1.append(5);
       // linkedList2.append(6);

        linkedListCombined= linkedListCombined.zipLists(linkedList1,linkedList2);
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 5 } -> Null",linkedListCombined.toString());

        //--------------------------

        linkedList1=new LinkedList();
        linkedList2=new LinkedList();

        linkedList1.append(1);
        linkedList2.append(2);

        //linkedList1.append(3);
        linkedList2.append(4);

        //linkedList1.append(5);
        linkedList2.append(6);

        linkedListCombined= linkedListCombined.zipLists(linkedList1,linkedList2);
        assertEquals("{ 1 } -> { 2 } -> { 4 } -> { 6 } -> Null",linkedListCombined.toString());

        //----------------------------
        linkedList1=new LinkedList();
        linkedList2=new LinkedList();

        //linkedList1.append(1);
        linkedList2.append(2);

        //linkedList1.append(3);
        linkedList2.append(4);

        //linkedList1.append(5);
        linkedList2.append(6);

        linkedListCombined= linkedListCombined.zipLists(linkedList1,linkedList2);
        assertEquals("{ 2 } -> { 4 } -> { 6 } -> Null",linkedListCombined.toString());


    }
}
