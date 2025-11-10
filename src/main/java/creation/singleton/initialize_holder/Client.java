package creation.singleton.initialize_holder;

public class Client {

    public static void main(String[] args) {
        LazyRegistryIODH singleton;
        singleton = LazyRegistryIODH.getInstance();
        singleton = LazyRegistryIODH.getInstance();
        singleton = LazyRegistryIODH.getInstance();
        singleton = LazyRegistryIODH.getInstance();
        singleton = LazyRegistryIODH.getInstance();
        
    }
}
