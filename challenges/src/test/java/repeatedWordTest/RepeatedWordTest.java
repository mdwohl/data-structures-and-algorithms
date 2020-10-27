package repeatedWordTest;

import org.junit.Test;
import repeatedWord.RepeatedWord;

import static org.junit.Assert.*;

public class RepeatedWordTest{
    @Test
    public void TestWithOneDuplicate() throws Exception {
        String test1 = "Java is difficult to learn. Python can be difficult too.";
        assertEquals("This should display difficult", "difficult", RepeatedWord.duplicateWord(test1));
    }

    @Test
    public void TestNoInput() throws Exception {
        String test2 = "";
        assertNull(RepeatedWord.duplicateWord(test2));
    }

    @Test
    public void TestMultipleDuplicates() throws Exception {
        String test2 = "Dog cat cat dog.";
        assertEquals("This should pass.", "cat", RepeatedWord.duplicateWord(test2));


    }
}

