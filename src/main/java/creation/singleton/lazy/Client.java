package creation.singleton.lazy;

import creation.singleton.eager.EagerRegistry;

public class Client {

    public static void main(String[] args) {
        EagerRegistry registry1 = EagerRegistry.getInstance();
        EagerRegistry registry2 = EagerRegistry.getInstance();


        LazyRegistryWithDCL lazySingleton1 = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazySingleton2 = LazyRegistryWithDCL.getInstance();
        System.out.println(lazySingleton1 == lazySingleton2);
    }
}
