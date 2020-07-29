package zadanieIII.Dom;

public class DivisionByZeroException extends RuntimeException{
    private double x;
    private double y;

    public DivisionByZeroException(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getMessage() {
        return "Nie dziel przez 0 ";
    }
}
