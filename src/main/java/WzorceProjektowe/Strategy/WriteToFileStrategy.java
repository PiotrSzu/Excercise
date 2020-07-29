package WzorceProjektowe.Strategy;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFileStrategy implements WriteStrategy{
    private final Path path = Paths.get("src\\main\\java\\OdczytPliku\\przykaldowyTekst.txt");
    @Override
    public void write(String line) throws Exception {
        try (BufferedWriter bw = Files.newBufferedWriter(path)) {
            bw.write(line);
            bw.write(System.lineSeparator());
        }
    }
}
