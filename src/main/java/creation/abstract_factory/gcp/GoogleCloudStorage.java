package creation.abstract_factory.gcp;

import creation.abstract_factory.Storage;

public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMib) {
        System.out.println("Allocated "+capacityInMib+" on gcp");
    }

    @Override
    public String getId() {
        return "gcp1";
    }
}
