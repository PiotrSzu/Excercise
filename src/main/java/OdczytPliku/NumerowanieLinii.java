package OdczytPliku;
//odczyt pliku i zapis z ponumerowanymi liczbami

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NumerowanieLinii {
    final static Path IN_PATH = Paths.get("src\\main\\java\\OdczytPliku\\in.txt");
    final static Path OUT_PATH = Paths.get("src\\main\\java\\OdczytPliku\\numerowanie.txt");

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(IN_PATH);
             BufferedWriter writer = Files.newBufferedWriter(OUT_PATH);) {
            int counter = 1;
            String line = reader.readLine();
            while (line != null) {
//                if (counter % 3 == 0) {
                writer.write(counter + ". ");
                writer.write(line);
                writer.newLine();
//                }
                counter++;
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
