package ZadanieIICenzura;

import java.util.Scanner;

public class MainString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String word: bannedWords) {
            String wordReplacementSimple = "";
            for (int i = 0; i < word.length(); i++) { //kot
                wordReplacementSimple=wordReplacementSimple+"*";
            }
            text = text.replaceAll(word, wordReplacementSimple);
        }
        System.out.println(text);
    }
}
