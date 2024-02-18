package MorseHashMap;

import java.util.HashMap;
import java.util.Map;

public class Translator {

    private final Map<Character, String> morseCode;


    public Translator() {
        morseCode = new HashMap<>();

        morseCode.put('a', ".-");
        morseCode.put('b', "-...");
        morseCode.put('c', "-.-.");
        morseCode.put('d', "-..");
        morseCode.put('e', ".");
        morseCode.put('f', "..-.");
        morseCode.put('g', "--.");
        morseCode.put('h', "....");
        morseCode.put('i', "..");
        morseCode.put('j', ".---");
        morseCode.put('k', "-.-");
        morseCode.put('l', ".-..");
        morseCode.put('m', "--");
        morseCode.put('n', "-.");
        morseCode.put('o', "---");
        morseCode.put('p', ".--.");
        morseCode.put('q', "--.-");
        morseCode.put('r', ".-.");
        morseCode.put('s', "...");
        morseCode.put('t', "-");
        morseCode.put('u', "..-");
        morseCode.put('v', "...-");
        morseCode.put('w', ".--");
        morseCode.put('x', "-..-");
        morseCode.put('y', "-.--");
        morseCode.put('z', "--..");
        morseCode.put('1', ".----");
        morseCode.put('2', "..---");
        morseCode.put('3', "...--");
        morseCode.put('4', "....-");
        morseCode.put('5', ".....");
        morseCode.put('6', "-....");
        morseCode.put('7', "--...");
        morseCode.put('8', "---..");
        morseCode.put('9', "----.");
        morseCode.put('0', "-----");
        morseCode.put('.', ".-.-.-");
        morseCode.put(',', "--..--");
        morseCode.put('?', "..--..");
        morseCode.put(' ', "|");

    }
    // En metod som tar en sträng i morsekod och returnerar motsvarande sträng i engelska

    public String getEnglish(String morse) {
        // Om strängen är tom, returnera tom sträng
        if (morse == null || morse.isEmpty()) {
            return "";
        }
        // Skapa en StringBuilder för att bygga upp
        // resultatet med användning av olika metoder
        //samt ge högre prestanda
        StringBuilder result = new StringBuilder();

        // Dela upp strängen i morsekod vid mellanslag
        String[] words = morse.split(" ");
        // Loopa igenom varje ord i morsekod
        for (String word : words) {
            // Om ordet är ett lodrätt streck, lägg till ett mellanslag i resultatet
            if (word.equals("| ")) {  //När vi skriver morse kod vi lägger till lodrätt sträck
                result.append(" ");   //och får resultat med separerade ord
            } else {
                // Annars, leta upp motsvarande bokstav i HashMap och lägger till den i resultatet
                //nyckel "a" values ".-"vi lägger till flera element med nycklar och värden
                // och sedan med hjälp av en loop itererar vi igenom varje element

                for (Map.Entry<Character, String> entry : morseCode.entrySet()) {
                    if (entry.getValue().equals(word)) {
                        result.append(entry.getKey());
                        break;
                    }
                }
            }
        }

        // Returnera resultatet som en sträng
        return result.toString();

    }

    // En metod som tar en sträng i engelska och returnerar motsvarande sträng i morsekod
    public String getMorse(String english) {
        // Om strängen är tom, returnera tom sträng
        if (english == null || english.isEmpty()) {
            return "";
        }
        // Skapa en StringBuilder för att bygga upp
        // resultatet med användning av olika metoder
        //samt ge högre prestanda
        StringBuilder result = new StringBuilder();
        // Gör om strängen till gemener
        english = english.toLowerCase();
        // Loopa igenom varje tecken i strängen
        for (int i = 0; i < english.length(); i++) {
            char c = english.charAt(i);
            // Om tecknet är ett mellanslag, lägg till ett lodrätt streck i resultatet
            if (c == ' ') {
                result.append("| ");
            } else {
                // Annars, leta upp motsvarande morsekod i HashMap och lägg till den i resultatet
                String code = morseCode.get(c);
                if (code != null) {
                    result.append(code).append(" ");
                }

            }
        }
        // Returnera resultatet som en sträng
        return result.toString();
    }

}
