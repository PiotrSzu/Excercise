package WzorceProjektowe.Strategy;

public class WriteToConsoleStrategy implements WriteStrategy{
    @Override
    public void write(String line) throws Exception {
        System.out.println(line);
    }
}
