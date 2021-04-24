package utilities.App;

import org.junit.Test;
import utilities.AnimalShelter;
import utilities.Cats;
import utilities.Dogs;

import static org.junit.Assert.*;
import static utilities.MultiBracketValidation.multiBracketValidation;

public class AppTest {

    @Test
    public void multiBracketValidationTest() {

        String input= "()[[Extra Characters]]";
        assertTrue(multiBracketValidation(input));

        input="[({}]";
        assertFalse(multiBracketValidation(input));

        input=" {}{Code}[Fellows](())";
        assertTrue(multiBracketValidation(input));

        input=" {(})";
        assertFalse(multiBracketValidation(input));

    }

}
