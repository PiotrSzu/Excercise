package ZadanieIV;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class UrlAnalyzerTest {
//    private static final String URL1 = "http://xyz.pl/abc"; // tworzymy stałego stringa do testowania.
//    private UrlAnalyzer testAssertion;
//    @BeforeEach//generujemy metodę,która zeruje metode setUp aby zawsze test pracował na czystym obiekcie - jak poniżej.
//    void setUp() {
//        testAssertion = new UrlAnalyzer();//stworzony obiekt do testowania
//    }
//    @Test
//    public void test1() throws Exception { //metoda sama chce rzucić wujątek więc go dodajemy(throws Exception)
//        List<String> test1 = testAssertion.analyze(URL1);
//        assertThat(test1).hasSize(3);
//    }

    //Zadanie wykonane na zajęciach
    private static final String URL_TO_ANALYZE= "http://www.abc.pl/xyz";
    private static final String URL_PART_I= "http";
    private static final String URL_PART_II= "www.abc.pl";
    private static final String URL_PART_III= "xyz";
    private static final String FAULTY_URL_PART= "uuu";
    private static final String FAULTY_URL_TO_ANALYZE= "http://www.abc.pl://xyz";
    private UrlAnalyzer urlAnalyzer;
    @BeforeEach
    public void setup(){
        urlAnalyzer = new UrlAnalyzer();
    }
    @Test
    public void testAnalyze() throws Exception {
        List<String> urlElements = urlAnalyzer.analyze(URL_TO_ANALYZE);
        assertThat(urlElements).as("URL Elements").hasSize(3).contains(URL_PART_I).contains(URL_PART_II).contains(URL_PART_III).doesNotContain(FAULTY_URL_PART);
        assertThat(URL_PART_I).as("URL Part I").startsWith("h").endsWith("p").doesNotContain(URL_PART_II).doesNotContain(URL_PART_III).doesNotContain(URL_PART_III);
        assertThat(URL_PART_III).as("URL Part I").hasSizeLessThanOrEqualTo(100).hasSizeGreaterThan(2).isEqualToIgnoringCase("XYZ");
    }
    @Test // testowanie wyjątku - cztery testy.
    void analyzeShouldThrowExceptionWhenIncorrectUrl() {
        assertThatThrownBy(() -> urlAnalyzer.analyze(FAULTY_URL_TO_ANALYZE)).hasMessageStartingWith("Invalid").hasMessageEndingWith("URL");
    }
    @Test
    void shouldThrowInvalidUrlException() {
        //given, when & then
        assertThatExceptionOfType(Exception.class)
                .isThrownBy(() -> urlAnalyzer.analyze(FAULTY_URL_TO_ANALYZE))
                .withMessage("Invalid URL")
                .withNoCause();
    }
    @Test
    void analyzeWhenUrlIsInvalid() {
        //given & when & then
        assertThatExceptionOfType(Exception.class)
                .isThrownBy(() -> urlAnalyzer.analyze(FAULTY_URL_TO_ANALYZE));
        assertThatThrownBy(() -> urlAnalyzer.analyze(FAULTY_URL_TO_ANALYZE))
                .isExactlyInstanceOf(Exception.class)
                .hasMessageEndingWith("URL")
                .hasMessageStartingWith("Invalid");
    }
    @Test
    public void testAnalyzeThrowingException() throws Exception {
        assertThatThrownBy(() -> { urlAnalyzer.analyze(FAULTY_URL_TO_ANALYZE); }).hasMessageStartingWith("Invalid URL").hasMessageEndingWith("URL").isExactlyInstanceOf(Exception.class);
    }
}