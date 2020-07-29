package ZadanieVI;

import java.io.File;

public class App {
    public static void main(String[] args) {
        //ZadanieVI
        File file = new File(".");  //new File("/") wyswietla zawartość katalogu głównego
        File[] files = file.listFiles();
        for (File f : files) {
            if (!f.isDirectory()) {     //lub: if (f.isFile())
                System.out.println(f.getName() + ": " + f.length() + " bytes.");
            }
        }
        //Alternatywna metoda na wyswietlenie RootDir File Listingu:
        File[] roots = File.listRoots();
        System.out.println("\n" + roots[0]);
        File rootDir = new File(roots[0].toString());
        File[] files2 = rootDir.listFiles();
        for (File f : files2) {
            if (!f.isDirectory()) {     //lub: if (f.isFile())
                System.out.println(f.getName() + ": " + f.length() + " bytes.");
            }
        }
    }
}
