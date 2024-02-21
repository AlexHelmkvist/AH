package MorseArray;

public class Convert {

    private final String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i ", "j ", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?", " "};
    private final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", ".-.-.-", "--..--", "..--..", "|"};


    public String getMorse(String text) {

        if (text == null || text.isEmpty()) {
            return "";
        }
        text = text.toLowerCase();
        char[] c = text.toCharArray();

        StringBuilder str = new StringBuilder();

        for (char value : c) {
            for (int j = 0; j < english.length; j++) {
                if (english[j].equalsIgnoreCase(String.valueOf(value))) {
                    str.append(morse[j]).append(" ");

                }

            }
        }

        return str.toString().trim();
    }

    public String getLetters(String code) {
        if (code == null || code.isEmpty()) {
            return "";
        }
        StringBuilder str = new StringBuilder();
        String[] letters = code.split(" ");
        for (String letter : letters) {
            for (int j = 0; j < morse.length; j++) {
                if (morse[j].equals(letter)) {
                    str.append(english[j]);
                }
            }

        }
        return str.toString();
    }
}
