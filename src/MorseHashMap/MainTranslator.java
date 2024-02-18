package MorseHashMap;

import java.util.Scanner;

public class MainTranslator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Välkommen till MorseTranslator!");
        System.out.println("Ange 'morse' för att konvertera från morsekod till engelska, ange '|' mellan ord.");
        System.out.println("Ange 'english' för att konvertera från english till morse.");
        String val = sc.nextLine();
        Translator translator = new Translator();

        if (val.equalsIgnoreCase("morse")) {
            System.out.println("Ange morsekod:");
            String morseCode = sc.nextLine();
            String englishText = translator.getEnglish(morseCode);
            System.out.println("Engelsk översättning: " + englishText);
        } else if (val.equalsIgnoreCase("english")) {
            System.out.println("Ange engelsk text:");
            String englishText = sc.nextLine();
            String morse = translator.getMorse(englishText);
            System.out.println("Morsekod: " + morse);
        } else {
            System.out.println("Ogiltigt val. Avslutar programmet.");
        }


    }
}
