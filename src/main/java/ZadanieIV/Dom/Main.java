package ZadanieIV.Dom;

public class Main {
    public static void main(String[] args) {
        String url = "https://onet.pl";
        UrlSpliter urlSpliter = new UrlSpliter();
        Url url1;
        try {
            url1 = urlSpliter.analize(url);
            System.out.println(url1);
        } catch (UrlException e) {
            System.out.println(e.getMessage());
        }
    }
}
