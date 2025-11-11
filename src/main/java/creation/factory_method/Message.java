package creation.factory_method;

public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeaders() {
        // Adds Some default headers
    }

    public void encrypt() {
        // Has some code to encrypt the content
    }

}
