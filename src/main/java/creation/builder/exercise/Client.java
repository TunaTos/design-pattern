package creation.builder.exercise;

public class Client {

    /**
     * public class Person {
     *     private int age;
     *     private String firstName;
     *     private String lastName;
     *     private String address;
     */

    public static void main(String[] args) {
        Person p1 = new Person.Builder()
                .setAge(10)
                .setFirstName("Park")
                .setLastName("Chulkyu")
                .setAddress("Busan")
                .buiild();

        System.out.println(p1.toString());
    }
}
