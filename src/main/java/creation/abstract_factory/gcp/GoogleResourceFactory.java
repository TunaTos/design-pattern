package creation.abstract_factory.gcp;

import creation.abstract_factory.Instance;
import creation.abstract_factory.ResourceFactory;
import creation.abstract_factory.Storage;

public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleCloudInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
