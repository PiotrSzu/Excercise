package zadanieIII.Dom;

public class ExceptionApp implements DivisionIf {

    @Override
    public double divide(double x, double y) {
        if(y==0){
            throw new DivisionByZeroException(x, y);
        }
        return x/y;
    }
}
