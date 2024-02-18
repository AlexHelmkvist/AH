package MorseArray;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestConvertMorse {

    @Test
    public void testEmptyMorseToEmptyEnglish() {
        Convert convert = new Convert();
        String testdata = "";
        String expected = "";
        String actual = convert.getMorse(testdata);
        assertEquals(expected, actual);
    }
    @Test
    public void testConverterLetterToMorse(){
        Convert convert = new Convert();
        String testdata = "a";
        String expected = ".- ";
        String actual = convert.getMorse(testdata);
        assertEquals(expected, actual);
    }
    @Test
    public void testConverterMorseToLetters(){
        Convert convert = new Convert();
        String testdata = ".-";
        String   expected = "a";
        String actual = convert.getLetters(testdata);
        assertEquals(expected, actual);
    }
    @Test
    public void testConverterWordToMorse(){
        Convert convert = new Convert();
        String testdata = "hello world";
        String expected = ".... . .-.. .-.. --- | .-- --- .-. .-.. -.. ";
        String actual = convert.getMorse(testdata);
        assertEquals(expected, actual);
    }
    @Test
    public void testConverterMorseToWord(){
        Convert convert = new Convert();
        String testdata = ".... . .-.. .-.. --- | .-- --- .-. .-.. -..";
        String expected = "hello world";
        String actual = convert.getLetters(testdata);
        assertEquals(expected, actual);
    }


}
