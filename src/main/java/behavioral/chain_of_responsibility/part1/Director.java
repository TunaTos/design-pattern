package behavioral.chain_of_responsibility.part1;

public class Director extends Employee {

    public Director(String name) {
        super(name, "Director");
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        // Director는 모든 종류의 휴가를 승인 가능
        if (application.getNoOfDays() <= 30) {
            application.approve(getName());
            return true;
        }
        // 30일 초과는 거절
        application.reject(getName());
        return true;
    }
}
