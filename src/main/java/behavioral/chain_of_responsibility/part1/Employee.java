package behavioral.chain_of_responsibility.part1;

public abstract class Employee {

    private String name;
    private String role;
    private Employee nextApprover;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void setNextApprover(Employee nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void processLeaveApplication(LeaveApplication application) {
        if (!processRequest(application) && nextApprover != null) {
            nextApprover.processLeaveApplication(application);
        }
    }

    protected abstract boolean processRequest(LeaveApplication application);

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
