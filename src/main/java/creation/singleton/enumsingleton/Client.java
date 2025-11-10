package creation.singleton.enumsingleton;

public class Client {

    public static void main(String[] args) {
        RegistryEnum config = RegistryEnum.INSTANCE;

        config.printConfig();

        System.out.println("*****************************");

        config.setAppName("MyAwesomeApp");
        config.setAppName("production");
        config.setMaxConnections(500);
        config.setDebugMode(false);

        System.out.println("*****************************");
        config.printConfig();

        RegistryEnum anotherConfig = RegistryEnum.INSTANCE;
    }
}
