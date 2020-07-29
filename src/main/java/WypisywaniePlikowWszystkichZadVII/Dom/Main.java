package WypisywaniePlikowWszystkichZadVII.Dom;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        File directory = new File(".");
        Files.walk(Paths.get(".")).forEach(file -> System.out.println(file.getFileName()));
    }
}
