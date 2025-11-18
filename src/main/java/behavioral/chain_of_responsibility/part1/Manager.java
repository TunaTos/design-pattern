package behavioral.chain_of_responsibility.part1;

public class Manager extends Employee {

    public Manager(String name) {
        super(name, "Manager");
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        // Manager는 PTO 5일 이하 또는 Sick leave 3일 이하 승인 가능
        if (application.getType() == LeaveApplication.Type.PTO && application.getNoOfDays() <= 5) {
            application.approve(getName());
            return true;
        } else if (application.getType() == LeaveApplication.Type.Sick && application.getNoOfDays() <= 3) {
            application.approve(getName());
            return true;
        }
        return false;
    }
}
