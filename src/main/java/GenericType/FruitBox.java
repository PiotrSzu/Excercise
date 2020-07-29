package GenericType;

public class FruitBox <T>{
    private T object;
    public FruitBox(T object) {
        if(object == null) {
            throw new IllegalStateException("Can't provide a null");
        }
        this.object = object;
    }
    public T getObject() {
        return object;
    }
    public void setObject(T object) {
        this.object = object;
    }
}
