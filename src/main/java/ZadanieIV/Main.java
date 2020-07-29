package ZadanieIV;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(UrlService.divideUrl("http://test.pl/wiadomosci/22/12/34/foto.jpg").toString());
        } catch (InvalidUrl e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
