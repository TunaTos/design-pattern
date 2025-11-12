package creation.abstract_factory.aws;

import creation.abstract_factory.Instance;
import creation.abstract_factory.ResourceFactory;
import creation.abstract_factory.Storage;

public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
