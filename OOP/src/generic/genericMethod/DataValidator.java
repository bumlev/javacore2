package generic.genericMethod;

public class DataValidator {

    public static <T> boolean validateData(T data  , ValidationCriteria<T> criteria) {

        return criteria.isValid(data);
    }
}
