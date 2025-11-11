package creation.builder.part1;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder{

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fName) {
        this.firstName = fName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lName) {
        this.lastName = lName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDay(LocalDate date) {
        Period ageInYear = Period.between(date, LocalDate.now());
        this.age = Integer.toString(ageInYear.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        // TODO: address 입력 후 수정
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName + " " + lastName,address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
