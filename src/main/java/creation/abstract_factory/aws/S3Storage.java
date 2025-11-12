package creation.abstract_factory.aws;

import creation.abstract_factory.Storage;

public class S3Storage implements Storage {

    public S3Storage(int capacityInMib) {
        System.out.println("Allocated "+capacityInMib+" on S3");
    }
    @Override
    public String getId() {
        return "S31";
    }
}
