package utilities.App;

import org.junit.Test;
import utilities.AnimalShelter;
import utilities.Cats;
import utilities.Dogs;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void AnimalShelterTest() {
        AnimalShelter animalShelter =new AnimalShelter();

        Exception exception = assertThrows(NullPointerException.class, () -> {
            animalShelter.dequeue("cat");
            animalShelter.dequeue("dog");
        });
        String expectedMessage = "Queue is Empty";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
        animalShelter.enqueue(new Cats("mary",1,"white","female"));
        animalShelter.enqueue(new Cats("jason",2,"black","male"));
        animalShelter.enqueue(new Cats("ace",3,"black","male"));
        animalShelter.enqueue(new Dogs("wolf",3,"black &white","male"));
        animalShelter.enqueue(new Dogs("koky",2,"gray","female"));
        assertEquals("Name: mary , Gender: female, Age: 1, Color: white" ,animalShelter.dequeue("cat").toString());
        assertEquals("Name: jason , Gender: male, Age: 2, Color: black" ,animalShelter.dequeue("cat").toString());
        assertEquals("Name: ace , Gender: male, Age: 3, Color: black" ,animalShelter.dequeue("cat").toString());
        assertEquals("Name: wolf , Gender: male, Age: 3, Color: black &white" ,animalShelter.dequeue("dog").toString());
        assertEquals("Name: koky , Gender: female, Age: 2, Color: gray" ,animalShelter.dequeue("dog").toString());
        assertEquals(null ,animalShelter.dequeue("anyanimal"));




    }
}
