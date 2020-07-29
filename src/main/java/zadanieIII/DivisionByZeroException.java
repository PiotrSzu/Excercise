package zadanieIII;

public class DivisionByZeroException extends RuntimeException{
    private double x;
    private double y;
    public DivisionByZeroException(double x, double y, String message) {
        super(message);
        this.x=x;
        this.y=y;
    }
    @Override
    public String getMessage() {
        return "Error when dividing "+x+ " by "+y + super.getMessage();
    }
}

