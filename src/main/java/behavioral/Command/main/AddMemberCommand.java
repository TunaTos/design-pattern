package behavioral.Command.main;

public class AddMemberCommand implements Command {

    private String emailAddress;
    private String listName;
    private EWService receiver;

    public AddMemberCommand(String email, String listName, EWService service) {
        this.emailAddress = email;
        this.listName = listName;
        this.receiver = service;
    }

    @Override
    public void execute() {
        receiver.addMember(emailAddress, listName);
    }
}
