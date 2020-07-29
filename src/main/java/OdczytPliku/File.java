package OdczytPliku;
//Stworz aplikacje, ktora bedzie czytala plik
//wsadowy ,,in. txt” i wypisywala jego co trzecia
//linie do pliku ,,out3.txt”

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class File {
    public static void main(String[] args) {
        try {
            String text = "Jajka, masło i jogurt wyjąć z lodówki i ocieplić w temp. pokojowej.\n" +
                    "Rabarbar umyć, osuszyć, odciąć zielone liście, łodyżki posiekać na 1 cm kawałki.\n" +
                    "Piekarnik nagrzać do 180 stopni C.\n" +
                    "Masło ubijać z cukrem pudrem i cukrem wanilinowym przez ok.\n" +
                    "8 minut aż będzie jasne i puszyste.\n" +
                    "Następnie dodać jajka i jogurt i wszystko krótko zmiksować - połączyć (masa może się rozwarstwić, ale nie należy się tym przejmować).\n" +
                    "Mąkę przesiać do oddzielnej miski razem z proszkiem do pieczenia i wymieszać.\n" +
                    "Przesypać do ubitej masy i wymieszać lub krótko zmiksować do połączenia się składników w gęste i napuszone ciasto, pod koniec dodać rabarbar i delikatnie wymieszać.\n" +
                    "Wyłożyć do keksówki o długości 32 cm i wstawić do nagrzanego piekarnika.\n" +
                    "Piec przez ok. 55 minut na złoty kolor (można sprawdzić patyczkiem czy ciasto jest w środku upieczone).";
            Files.writeString(Paths.get("C:\\Users\\User\\IdeaProjects\\ZadanieI18.07\\src\\main\\java\\OdczytPliku\\in.txt"), text, StandardOpenOption.CREATE);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        try {
            String odczyt = Files.readString(Paths.get("C:\\Users\\User\\IdeaProjects\\ZadanieI18.07\\src\\main\\java\\OdczytPliku\\in.txt"));
            System.out.println("Plik odczytan:");
            System.out.println(odczyt);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
