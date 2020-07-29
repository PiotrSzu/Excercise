package zadanieIII;

public class ExceptionApp implements DivisionIf   {
    @Override
    public double divide(double x, double y)throws DivisionByZeroException{
        if (y == 0) {
            throw new DivisionByZeroException(x, y, "Division by zero is forbidden.");
        }
        return x/y;
    }
}

