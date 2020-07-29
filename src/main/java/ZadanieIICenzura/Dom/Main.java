package ZadanieIICenzura.Dom;

public class Main {
    public static void main(String[] args) {
        System.out.println(Censored.censoreWords("Moj pies jest bardzo fajny"));
        System.out.println(Censored.censoreWords("Moj kot jest bardzo fajny"));
        System.out.println(Censored.censoreWords("Pies to pies"));
        System.out.println(Censored.censoreWords("Moj PIES jest bardzo fajny"));
        System.out.println(Censored.censoreWords("Moj dfgdfg jest bardzo fajny"));
    }
}
