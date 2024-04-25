package generic.genericMethod;


// Example of validation criteria for numbers (e.g., must be positive)
public class PositiveNumberValidation implements ValidationCriteria<Number> {

    @Override
    public boolean isValid(Number data) {
        return data.doubleValue() > 0;
    }
}
