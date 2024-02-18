package MorseHashMap;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseTranslatorTest {

    @Test
    public void testEnglishToMorse() {
        Translator translator = new Translator();
        String english = "a";
        String expected = ".- ";
        String actual = translator.getMorse(english);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyToEmpty() {
        Translator translator = new Translator();
        String english = "";
        String expected = "";
        String actual = translator.getEnglish(english);
        assertEquals(expected, actual);
    }

    @Test
    public void testWordToMorse() {
        Translator translator = new Translator();
        String english = "Hello World";
        String expected = ".... . .-.. .-.. --- | .-- --- .-. .-.. -.. ";
        String actual = translator.getMorse(english);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyMorseToEmptyEnglish() {
        Translator translator = new Translator();
        String english = "";
        String expected = "";
        String actual = translator.getMorse(english);
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseToEnglish() {
        Translator translator = new Translator();
        String morse = ".- ";
        String expected = "a";
        String actual = translator.getEnglish(morse);
        assertEquals(expected, actual);
    }


    @Test
    public void testMorseToWord() {
        Translator translator = new Translator();
        String morse = ".... . .-.. .-.. --- | .-- --- .-. .-.. -.. ";
        String expected = "hello world";
        String actual = translator.getEnglish(morse);
        assertEquals(expected, actual);
    }
}
