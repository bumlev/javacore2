package generic.genericMethod;

public interface ValidationCriteria<T> {
    boolean isValid(T data);
}
