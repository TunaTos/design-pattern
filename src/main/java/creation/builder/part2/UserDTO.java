package creation.builder.part2;

import creation.builder.part1.Address;
public class UserDTO {
    private String name;
    private String address;
    private String age;

    // private 생성자 - 빌더를 통해서만 생성
    private UserDTO(UserDTOBuilder builder) {
        this.name = builder.firstName + " " + builder.lastName;
        this.address = builder.address;
        this.age = builder.age;
    }

    // getter만 public으로
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getAge() { return age; }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static class UserDTOBuilder {
        private String firstName;
        private String lastName;
        private String age;
        private String address;

        public UserDTOBuilder withFirstName(String fName) {
            this.firstName = fName;
            return this;
        }

        public UserDTOBuilder withLastName(String lName) {
            this.lastName = lName;
            return this;
        }

        public UserDTOBuilder withAge(String age) {
            this.age = age;
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getCity() + " " + address.getState() + " " + address.getHouseNumber();
            return this;
        }

        public UserDTO build() {
            return new UserDTO(this);
        }
    }
}