package zadanieIII;

public class Main {
    public static void main(String[] args) {
        ExceptionApp a = new ExceptionApp();
        try {
            a.divide(4.0,0.0);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}