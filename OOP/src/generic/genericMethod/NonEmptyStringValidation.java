package generic.genericMethod;

public class NonEmptyStringValidation implements ValidationCriteria<String> {
    @Override
    public boolean isValid(String data) {
        return !data.isEmpty();
    }
}
