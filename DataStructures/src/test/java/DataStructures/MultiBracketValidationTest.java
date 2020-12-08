package test.java.DataStructures;

import main.java.DataStructures.multibracket.MultiBracketValidation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MultiBracketValidationTest {

    @Test
    public void bracketTester(){
        String input1 = "(parentheses)";
        String input2 = "{curlybrackets}";
        String input3 = "[squarebrackets]";
        String input4 = "{should fail)";
        String input5 = "[should also fail}";
        String input6 = "(totally whack]";

        assertEquals(true, MultiBracketValidation.validate(input1), "true");
        assertEquals(true, MultiBracketValidation.validate(input2), "true");
        assertEquals(true, MultiBracketValidation.validate(input3), "true");
        assertEquals(false, MultiBracketValidation.validate(input4), "false");
        assertEquals(false, MultiBracketValidation.validate(input5), "false");
        assertEquals(false, MultiBracketValidation.validate(input6), "false");
    }
}
