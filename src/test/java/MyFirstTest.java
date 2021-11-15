import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class MyFirstTest {

    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "CodeUp";

        assertNotEquals(expected, actual);
    }

    List<String> languages = new ArrayList<>();
    List<String> moreLanguages = new ArrayList<>();

    @Test
    public void testIfArrayListsAreEquals(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testIfArraysAreEquals(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfStringContainsChar(){
        String language = "PHP";

        assertTrue("assert True", language.contains("H"));
        assertFalse("assert False", language.contains("J"));
    }


}
