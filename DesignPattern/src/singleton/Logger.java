package singleton;

public class Logger {

    private static Logger instance;

    // Private constructor to prevent instantiation from outside the class
    private Logger() {}


    // Static method to get the singleton instance of Logger
    public static Logger getInstance() {

        // Check if the instance is null, create a new instance if it's null
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to write log messages
    public void log(String message) {
        System.out.println(message);
    }
}
