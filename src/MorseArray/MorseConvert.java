package MorseArray;

import java.util.Scanner;

public class MorseConvert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Välkommen till MorseTranslator!");
        System.out.println("Ange 'morse' för att konvertera från morsekod till engelska, ange '|' mellan ord.");
        System.out.println("Ange 'english' för att konvertera från english till morse.");

        Convert convert = new Convert();
        String input = sc.nextLine();
        while (!input.equals("stop")) {

            if (input.equalsIgnoreCase("morse")) {
                System.out.println("Ange morsekod:");
                String morseCode = sc.nextLine();
                String englishText = convert.getLetters(morseCode);
                System.out.println("Engelsk översättning: " + englishText);
                System.out.println("Ange morse eller english för att utföra konvertering.");
                input = sc.nextLine();
            } else if (input.equalsIgnoreCase("english")) {
                System.out.println("Ange engelsk text:");
                String englishText = sc.nextLine();
                String morse = convert.getMorse(englishText);
                System.out.println("Morsekod: " + morse);
                System.out.println("Ange morse eller english för att utföra konvertering.");
                input = sc.nextLine();
            } else {
                System.out.println("Ogiltigt val. Avslutar programmet.");
                break;
            }


        }

    }
}