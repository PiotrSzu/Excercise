package OdczytPliku;

//Z pliku tekstowego ma wypisać same liczby

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class OdczytLiczby {
    final static Path IN_PATH = Paths.get("src\\main\\java\\OdczytPliku\\in.txt");
    final static Path OUT_PATH = Paths.get("src\\main\\java\\OdczytPliku\\odczyt.txt");
    public static void main(String[] args) {
        try (Scanner fileIn = new Scanner(Files.newBufferedReader(IN_PATH));
             PrintWriter fileOut =
                     new PrintWriter(Files.newBufferedWriter(OUT_PATH))) {
            while (fileIn.hasNext()) {
                fileIn.next();
                if (fileIn.hasNextInt()) {
                    fileOut.println(fileIn.next());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
