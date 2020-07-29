package OdczytPliku;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ZadanieX {
    private final static List<Character> VOWELS = List.of('a', 'ą', 'e', 'ę', 'i', 'o', 'ó', 'u', 'y');
    private final static List<Character> PUNCTUATION_MARKS = List.of('(', ')', ',', '.', '-', ':', ';');
    private final static List<Character> NUMBERS = List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
    private final static List<Character> WHITESPACES = List.of(' ', '\n');
    public static void countNumberOfVowelsAndConsonantsAndWhitespaceConsonants(Path sourceTextFilePath, Path destinationTextFilePath) {
        AtomicInteger vowelsNumber = new AtomicInteger();
        AtomicInteger punctuationMarksNumber = new AtomicInteger();
        AtomicInteger consonantsNumber = new AtomicInteger();
        AtomicInteger numbersNumber = new AtomicInteger();
        AtomicInteger whitespacesNumber = new AtomicInteger();
        List<Character> chars;
        try (BufferedReader reader = Files.newBufferedReader(sourceTextFilePath);
             BufferedWriter writer = Files.newBufferedWriter(destinationTextFilePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                chars = line.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
                chars.stream().forEach(c -> {
                    if (VOWELS.contains(c)) {
                        vowelsNumber.getAndIncrement();
                    } else if (PUNCTUATION_MARKS.contains(c)) {
                        punctuationMarksNumber.getAndIncrement();
                    } else if (NUMBERS.contains(c)) {
                        numbersNumber.getAndIncrement();
                    } else if (WHITESPACES.contains(c)) {
                        whitespacesNumber.getAndIncrement();
                    } else {
                        consonantsNumber.getAndIncrement();
                    }
                });
//                for (Character c: chars) {
//                    if (VOWELS.contains(c)) {
//                        vowelsNumber++;
//                    } else if (PUNCTUATION_MARKS.contains(c)) {
//                        punctuationMarksNumber++;
//                    } else if (NUMBERS.contains(c)) {
//                        numbersNumber++;
//                    } else {
//                        consonantsNumber++;
//                    }
            }
            writer.write("vowelsNumber: " + vowelsNumber);
            writer.newLine();
            writer.write("punctuationMarksNumber: " + punctuationMarksNumber);
            writer.newLine();
            writer.write("consonantsNumber: " + consonantsNumber);
            writer.newLine();
            writer.write("numbersNumber: " + numbersNumber);
            writer.newLine();
            writer.write("whitespacesNumber: " + whitespacesNumber);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }
}
