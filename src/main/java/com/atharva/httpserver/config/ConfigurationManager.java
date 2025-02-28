package com.atharva.httpserver.config;

/**
 * ConfigurationManager will make use of the singleton pattern
 * this makes sure that we don't make multiple configuration managers,
 * beacuse we only need one that will be shared across multiple projects
 */
public class ConfigurationManager {
    private static ConfigurationManager configManagerInstance;
    private static Configuration currentConfig;

    // private constructor so other code cannot make one
    private ConfigurationManager() {}

    // getter method that creates a config manager (if it does not already exist) and returns it
    public static ConfigurationManager getInstance() {
        if(configManagerInstance == null)
            configManagerInstance = new ConfigurationManager();

        return configManagerInstance;
    }

    /**
     *
     * @param filePath
     * loads a configuration file by the provided file path
     */
    public void loadConfigurationFile(String filePath) {

    }

    /**
     * returns the currently loaded configuration
     */
    public void getCurrentConfiguration() {}
}
