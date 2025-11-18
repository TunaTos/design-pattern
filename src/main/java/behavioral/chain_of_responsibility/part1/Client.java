package behavioral.chain_of_responsibility.part1;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        // Chain 생성: ProjectLead -> Manager -> Director
        Employee projectLead = new ProjectLead("Alice");
        Employee manager = new Manager("Bob");
        Employee director = new Director("Charlie");

        projectLead.setNextApprover(manager);
        manager.setNextApprover(director);

        // 테스트 케이스 1: 1일 Sick leave (ProjectLead가 승인)
        LeaveApplication application1 = LeaveApplication.getBuilder()
                .withType(LeaveApplication.Type.Sick)
                .from(LocalDate.now())
                .to(LocalDate.now().plusDays(1))
                .build();

        // 테스트 케이스 2: 3일 PTO (Manager가 승인)
        LeaveApplication application2 = LeaveApplication.getBuilder()
                .withType(LeaveApplication.Type.PTO)
                .from(LocalDate.now())
                .to(LocalDate.now().plusDays(3))
                .build();

        // 테스트 케이스 3: 10일 LOP (Director가 승인)
        LeaveApplication application3 = LeaveApplication.getBuilder()
                .withType(LeaveApplication.Type.LOP)
                .from(LocalDate.now())
                .to(LocalDate.now().plusDays(10))
                .build();

        // 테스트 케이스 4: 35일 PTO (Director가 거절)
        LeaveApplication application4 = LeaveApplication.getBuilder()
                .withType(LeaveApplication.Type.PTO)
                .from(LocalDate.now())
                .to(LocalDate.now().plusDays(35))
                .build();

        // Chain을 통해 처리
        System.out.println("=== Leave Application Processing ===");

        projectLead.processLeaveApplication(application1);
        System.out.println("Application 1: " + application1);

        projectLead.processLeaveApplication(application2);
        System.out.println("Application 2: " + application2);

        projectLead.processLeaveApplication(application3);
        System.out.println("Application 3: " + application3);

        projectLead.processLeaveApplication(application4);
        System.out.println("Application 4: " + application4);
    }
}
