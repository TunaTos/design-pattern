package creation.abstract_factory;

import creation.abstract_factory.aws.AwsResourceFactory;
import creation.abstract_factory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {this.factory = factory;}

    public Instance createServer(Instance.Capacity cap, int storageMib) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance instance1 = aws.createServer(Instance.Capacity.micro, 20480);
        instance1.start();
        instance1.stop();

        System.out.println("============================");
        Client gcp = new Client(new GoogleResourceFactory());
        Instance instance2 = gcp.createServer(Instance.Capacity.large, 50000);
        instance2.start();
        instance1.stop();
    }
}
