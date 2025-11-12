package creation.builder.exercise;

public class Person {
    private final int age;
    private final String firstName;
    private final String lastName;
    private final String address;

    private Person(Builder builder) {
        this.age = builder.age;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {
        private int age;
        private String firstName;
        private String lastName;
        private String address;

        public  Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person buiild() {
            return new Person(this);
        }

    }
}
