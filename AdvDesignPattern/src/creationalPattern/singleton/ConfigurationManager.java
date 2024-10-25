package creationalPattern.singleton;

public class ConfigurationManager {

    private static ConfigurationManager instance;

    private ConfigurationManager() {
        // Load configuration data
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }
}
