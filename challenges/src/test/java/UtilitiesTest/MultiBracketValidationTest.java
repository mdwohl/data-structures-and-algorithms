package UtilitiesTest;

import org.junit.Test;
import utilities.MultiBracketValidation;

import static org.junit.Assert.assertEquals;

public class MultiBracketValidationTest {

    @Test
    public void validateTest(){
        String test1 = "([{}])"; //should be true
        String test2 = "(([Hello]{there}))"; //should be true
        String test3 = "{{]}"; //should be false

        assertEquals("the brackets balance", true, MultiBracketValidation.bracketValidation(test1));
        assertEquals("the brackets balance", true, MultiBracketValidation.bracketValidation(test2));
        assertEquals("the brackets do not balance", false, MultiBracketValidation.bracketValidation(test3));
    }
}
