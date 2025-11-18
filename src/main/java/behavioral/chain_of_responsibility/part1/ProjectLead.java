package behavioral.chain_of_responsibility.part1;

public class ProjectLead extends Employee {

    public ProjectLead(String name) {
        super(name, "Project Lead");
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        // Project Lead는 1일 이하의 Sick leave만 승인 가능
        if (application.getType() == LeaveApplication.Type.Sick && application.getNoOfDays() <= 1) {
            application.approve(getName());
            return true;
        }
        return false;
    }
}
