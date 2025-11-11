package creation.factory_method;

public class JSONMessageCreator extends  MessageCreator{

    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
