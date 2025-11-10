package creation.singleton.initialize_holder;

public class LazyRegistryIODH {

    private LazyRegistryIODH() {
        System.out.println("In LazyRegistry in LazyRegistryIODH");

    }

    private static class RegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
