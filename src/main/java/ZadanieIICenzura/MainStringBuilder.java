package ZadanieIICenzura;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStringBuilder { //wydajnieszja opcja
    public static void main(String[] args) {
        String[] hotWords = {"ppp", "wwww"};
        String text = "aaa sss ppp wwww www pppp";
        String result;
        List<String> textList = Arrays.asList(text.split(" "));
        for (String s : hotWords) {
            textList = textList.stream()
                    .map(x -> asAsterisk(x, s))
                    .collect(Collectors.toList());
        }
        result=textList.stream().collect(Collectors.joining(" "));
        System.out.println(result);
    }
    private static String asAsterisk(String word1, String word2) {
        if (word1.equals(word2)) {
            return "*".repeat(word1.length());
        } else {
            return word1;
        }
    }
}
