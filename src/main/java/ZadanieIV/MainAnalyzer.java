package ZadanieIV;

public class MainAnalyzer {
    public static void main(String[] args){
        UrlAnalyzer urlAnalyzer = new UrlAnalyzer();
        try {
            for(String s: urlAnalyzer.analyze("http://xyz.pl/abc")){
                System.out.println(s);
            }
            for(String s: urlAnalyzer.analyze("http://xyz.pl://abc")){
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
