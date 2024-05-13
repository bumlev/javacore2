package creational.abstractFactory.exception;

public class InvalidMobile extends Exception {

    @Override
    public String getMessage() {
        return "Mobile doesn't exist";
    }
}
