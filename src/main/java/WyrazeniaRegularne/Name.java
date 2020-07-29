package WyrazeniaRegularne;
//Stworz aplikacje, ktora z listy przeslanych imion i
//nazwisk, wylapie tylko te pary, ktore zostaly podane
//poprawm’e, tzn. zarowno imie jaki nazwisko zostalo
//zapisane wielka litera. Aplikacja ma za zadanie:
//chzytywaé kolejne imiona, aż do momentu w
//ktorym użytkownik nie poda slowa kluczowego
//end
//-W momencie gdy dana para spełrni warunki,
//aplikacja ma ja wypisać na konsoli


import java.util.Scanner;
import java.util.regex.Pattern;

public class Name {
        private static final Pattern pattern = Pattern.compile("^[A-ZŻŹAĆĘŁÓ][a-zżźąćłó]+ [A-ZŻŹAĆĘŁÓ][a-zżźąćłó]+$"); //wymusza podanie dwóch wyrazów zaczynającychsię wielką litera.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^[A-Z][a-z]+ [A-Z][a-z]+$";
        String text;
        while (!"end".equals(text = scanner.nextLine())){
            if (Pattern.matches(regex, text)){
                System.out.println("Correct name: >>" + text);
            }
        }
    }
}
