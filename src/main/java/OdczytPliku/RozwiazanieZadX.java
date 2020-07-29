package OdczytPliku;
//Stworz aplikacje, ktora dokona analizy tekstu z
//pliku ,,in.txt” i wypisze:
//- liczbe zawartych w nim samoglosek
//- liczbe zawartych w nim spolglosek
//- liczbe znakow interpunkcyjnych

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RozwiazanieZadX {
    private static final String CHAR_SEPARATOR = "";
    private static final Pattern VOVEL_PATTERN = Pattern.compile("[aąeęioyóuAĄEYĘIOÓU]");
    private static final Pattern CONSNONAT_PATTERN = Pattern.compile("[qwrtpsśdfghjklłzźżxcćvbnńmQWRTPSŚDFGHJKLŁZŻŹXCĆVBNŃM]");
    private static final Pattern PUNCTUATION_MARKS_PATTERN = Pattern.compile("[-(),.]");
    public static void main(String[] args) {
        Path filePath = Paths.get("src\\main\\java\\OdczytPliku\\in.txt");
        AtomicInteger vovelCounter = new AtomicInteger();
        AtomicInteger consonantCounter = new AtomicInteger();
        AtomicInteger punctuationMarkCounter = new AtomicInteger();
        try (BufferedReader bf = Files.newBufferedReader(filePath)) {
//            Files.lines(filePath)
//                    .flatMap(line -> Arrays.stream(line.split(CHAR_SEPARATOR)))
//                    .forEach(character -> {
//                        if (isVovel(character)) {
//                            vovelCounter.getAndIncrement();
//                        } else if (isConsonant(character)) {
//                            consonantCounter.getAndIncrement();
//                        } else if (isPunctuationMark(character)) {
//                            punctuationMarkCounter.getAndIncrement();
//                        }
//                    });
            String line;
            String[] chars;
            while (Objects.nonNull(line = bf.readLine())) {
                chars = line.split(CHAR_SEPARATOR);
                for (String character : chars) {
                    if (isVovel(character)) {
                        vovelCounter.getAndIncrement();
                    } else if (isConsonant(character)) {
                        consonantCounter.getAndIncrement();
                    } else if (isPunctuationMark(character)) {
                        punctuationMarkCounter.getAndIncrement();
                    }
                }
            }
            System.out.println("Spółgłoski: " + consonantCounter.get());
            System.out.println("Samogłoski: " + vovelCounter.get());
            System.out.println("Znak interpunkcyjne: " + punctuationMarkCounter.get());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static boolean isVovel(String character) {
        return matchBase(VOVEL_PATTERN, character);
    }
    private static boolean isConsonant(String character) {
        return matchBase(CONSNONAT_PATTERN, character);
    }
    private static boolean isPunctuationMark(String character) {
        return matchBase(PUNCTUATION_MARKS_PATTERN, character);
    }
    private static boolean matchBase(Pattern pattern, String character) {
        Matcher matcher = pattern.matcher(character);
        return matcher.matches();
    }
}
