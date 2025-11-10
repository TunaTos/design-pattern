package creation.singleton.enumsingleton;

public enum RegistryEnum {

    INSTANCE;

    private String appName;
    private String version;
    private String environment;
    private int maxConnections;
    private boolean debugMode;

    RegistryEnum() {
        this.appName = "MyApp";
        this.version = "1.0.0";
        this.environment = "development";
        this.maxConnections = 100;
        this.debugMode = true;
        System.out.println("ConfigManager initialized with default settings");
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }

    public void printConfig() {
        System.out.println("=== Application Configuration ===");
        System.out.println("App Name: " + appName);
        System.out.println("Version: " + version);
        System.out.println("Environment: " + environment);
        System.out.println("Max Connections: " + maxConnections);
        System.out.println("Debug Mode: " + debugMode);
    }

}
