package WypisywaniePlikowWszystkichZadVII;

import java.io.File;

public class Pliki {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\IdeaProjects");  //new File("/") wyswietla zawartość katalogu głównego
        String[] pliki;
        pliki = file.list();
        for (String p : pliki) {
            System.out.println(p);
        }
    }
}
