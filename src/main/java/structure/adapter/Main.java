package structure.adapter;

public class Main {

    public static void main(String[] args) {
        // Using Class / Two-way adapter
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeDate(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();

        String card = designer.designCard(adapter);
        System.out.println(card);

        System.out.println("************************************************");
        // Using Object Adapter
        Employee employee = new Employee();
        populateEmployeeDate(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(objectAdapter);
        System.out.println(card);

    }

    private static void populateEmployeeDate(Employee employee) {
        employee.setFullName("Elliot Anderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("All safe Cybersecurity, New York City, New York");
    }
}
