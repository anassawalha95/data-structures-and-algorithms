package leftJoin;

import hashtable.Hashtable;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AppTest {
    Hashtable hashtable1;
    Hashtable hashtable2;



    @Test
    public void leftJoinTest1() {
        LeftJoin join=new LeftJoin();
        hashtable1 = new Hashtable();
        hashtable1.add("McDonalds", "burger");
        hashtable1.add("happy", "joly");
        hashtable1.add("fruits", "banana");

        hashtable2 = new Hashtable();
        hashtable2.add("McDonalds", "chicken wings");
        hashtable2.add("happy", "sad");
        hashtable2.add("fruits", "oranges");


        String[] one = {"McDonalds", "burger", "chicken wings"};
        String[] two = {"fruits", "banana", "oranges"};
        String[] three = {"happy", "joly", "sad"};
        List<String[]> output = new ArrayList<>();
        output.add(one);
        output.add(two);
        output.add(three);
        join.join2HashTables(hashtable1, hashtable2);
        System.out.println(join.toString());
        assertArrayEquals(output.get(0), (join.join2HashTables(hashtable1, hashtable2)).get(0));
        assertArrayEquals(output.get(1), (join.join2HashTables(hashtable1, hashtable2)).get(1));
        assertArrayEquals(output.get(2), (join.join2HashTables(hashtable1, hashtable2)).get(2));

    }

    // checks scenario where right hashmap is shorter
    @Test
    public void leftJoinTest2() {
        LeftJoin join=new LeftJoin();
        hashtable1 = new Hashtable();
        hashtable1.add("McDonalds", "burger");
        hashtable1.add("happy", "joly");
        hashtable1.add("fruits", "banana");

        hashtable2 = new Hashtable();
        hashtable2.add("McDonalds", "chicken wings");
        hashtable2.add("happy", "sad");



        String[] one = {"McDonalds", "burger", "chicken wings"};
        String[] two = {"fruits", "banana", null};
        String[] three = {"happy", "joly", "sad"};
        List<String[]> output = new ArrayList<>();
        output.add(one);
        output.add(two);
        output.add(three);
        join.join2HashTables(hashtable1, hashtable2);
        System.out.println(join.toString());
        assertArrayEquals(output.get(0), (join.join2HashTables(hashtable1, hashtable2)).get(0));
        assertArrayEquals(output.get(1), (join.join2HashTables(hashtable1, hashtable2)).get(1));
        assertArrayEquals(output.get(2), (join.join2HashTables(hashtable1, hashtable2)).get(2));
    }


    @Test
    public void leftJoinTest3() {
        LeftJoin join=new LeftJoin();
        hashtable1 = new Hashtable();
        hashtable1.add("McDonalds", "burger");
        hashtable1.add("happy", "joly");
        hashtable1.add("fruits", "banana");

        hashtable2 = new Hashtable();
   

        String[] one = {"McDonalds", "burger", null};
        String[] two = {"fruits", "banana", null};
        String[] three = {"happy", "joly", null};
        List<String[]> output = new ArrayList<>();
        output.add(one);
        output.add(two);
        output.add(three);
        join.join2HashTables(hashtable1, hashtable2);
        System.out.println(join.toString());
        assertArrayEquals(output.get(0), (join.join2HashTables(hashtable1, hashtable2)).get(0));
        assertArrayEquals(output.get(1), (join.join2HashTables(hashtable1, hashtable2)).get(1));
        assertArrayEquals(output.get(2), (join.join2HashTables(hashtable1, hashtable2)).get(2));
    }
}