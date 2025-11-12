package creation.abstract_factory.gcp;

import creation.abstract_factory.Instance;
import creation.abstract_factory.Storage;

public class GoogleCloudInstance implements Instance {

    public GoogleCloudInstance(Capacity capacity) {
        System.out.println("Created GoogleCloudInstance");
    }

    @Override
    public void start() {
        System.out.println("GoogleCloudInstance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached "+storage+"to GoogleCloudInstance");
    }

    @Override
    public void stop() {
        System.out.println("GoogleCloudInstance stopped");
    }
}
