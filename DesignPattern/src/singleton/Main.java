package singleton;

public class Main {

    public static void main(String[] args) {

        // Get the singleton instance of Logger
        Logger logger = Logger.getInstance();

        // Write log messages
        logger.log("This is a log message.");
        logger.log("Another log message.");
    }
}
