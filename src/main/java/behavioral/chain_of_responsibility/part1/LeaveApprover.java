package behavioral.chain_of_responsibility.part1;

public class LeaveApprover extends Employee {

    public LeaveApprover(String name) {
        super(name, "Leave Approver");
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        // 기본적으로 처리하지 않고 다음으로 넘김
        return false;
    }
}
