package creation.singleton.lazy;

public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL() {}
    private static volatile LazyRegistryWithDCL INSTANCE;

    public static LazyRegistryWithDCL getInstance() {
        // need to synchronization
        if (INSTANCE == null) {
            synchronized (LazyRegistryWithDCL.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}
