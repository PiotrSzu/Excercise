package ZadanieIICenzura.Dom;

import java.util.Arrays;
import java.util.List;

public class Censored {
    private static final String SPLITTER = " ";
    private static final List<String> CENSORED_WORDS = Arrays.asList("pies", "kot");

    public static String censoreWords(String sentence) {
        String[] words = sentence.split(SPLITTER);
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            if (CENSORED_WORDS.contains(s.toLowerCase())) {
                for (int i = 0; i < s.length(); i++) {
                    sb.append("*");
                }
            } else {
                sb.append(s);
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
