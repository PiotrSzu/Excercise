package WzorceProjektowe.Strategy;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String message;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiadomosc");
        message = scanner.nextLine();
        WriteStrategy writeStrategy= new WriteToFileStrategy();
        try {
            writeStrategy.write(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
