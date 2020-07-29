//package OdczytPliku;
//
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.concurrent.atomic.AtomicInteger;
//import java.util.stream.Stream;
//
//public class NumerowanieStrumien {
//    void number(Path input, Path output) throws IOException {
//        FileReader f = new FileReader(input.toString());
//        BufferedReader reader = new BufferedReader(f);
//        BufferedWriter writer = Files.newBufferedWriter(output);
//        Stream<String> stringStream = reader.lines();
//        AtomicInteger counter = new AtomicInteger(1);
//        stringStream.forEach(x -> {
//            try {
//                writer.write(counter.getAndIncrement() + " " + x + System.lineSeparator());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
//        writer.close();
//    }
//    public static void main(String[] args) throws IOException {
//        LineNumerator lineNumerator = new LineNumerator();
//        final Path INPUT_PATH = Path.of("./src/main/java/com/sda/numberedLines/in.txt");
//        final Path OUTPUT_PATH = Paths.get("./src/main/java/com/sda/numberedLines/out.txt");
//        lineNumerator.number(INPUT_PATH, OUTPUT_PATH);
//    }
//}
