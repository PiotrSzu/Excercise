package OdczytPliku;
//Stworz aplikacje, ktora bedzie czytala plik
//wsadowy ,,in. txt” i wypisywala jego co trzecia
//linie do pliku ,,out3.txt”


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ZadaniePlik {
    final static Path IN_PATH = Paths.get("src\\main\\java\\OdczytPliku\\in.txt");
    final static Path OUT_PATH = Paths.get("src\\main\\java\\OdczytPliku\\out3.txt");
    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(IN_PATH); // tak stworzona klauzula try sama zamyka strumień odczytu i zapisu pliku.
             BufferedWriter writer = Files.newBufferedWriter(OUT_PATH);) {
            int counter = 1; // licznik aby użyć i iterować po pętli i linijkach tekstu
            String line = reader.readLine();
            while (line != null) {
                if (counter % 3 == 0) { //modulo 3 aby wypisać co trzecią linijkę.
                    writer.write(line);
                    writer.newLine();
                }
                counter++;
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
