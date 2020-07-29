package WypisywaniePlikowWszystkichZadVII;

import java.io.File;
import java.util.ArrayDeque;
//Stworz aplikacje, ktora bedzie wypisywala liste
//wszystkich folderow znajdujqcych sie folderze glownym
//aplikacji, zagnieidionych bezpoéredm’o jaki poérednio
//Na sam koniec aplikacja powinna wypisac' liczbe
//wszystkich znalezionych folderow (uwzgledniajqc w
//niej folder od ktorego rozpoczeto wyszukiwanie )

public class Listy {
    public static void main(String[] args) {
        int dirCounter = 0;
        ArrayDeque<File> queue = new ArrayDeque<>();
        File directory = new File(".");
        queue.add(directory);
        do {
            File[] directories = queue.getFirst().listFiles();
            for (File dir : directories) {
                System.out.println(dir.getName());
                if (dir.isDirectory()) {
                    queue.addLast(dir);
                    dirCounter++;
                }
            }
            queue.removeFirst();
        } while (queue.size() > 0);
        System.out.println("Number of folders: " + dirCounter);
    }
}

