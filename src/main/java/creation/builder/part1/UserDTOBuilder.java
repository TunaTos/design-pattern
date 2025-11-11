package creation.builder.part1;

import java.time.LocalDate;

// Abstract Builder
public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String fName);

    UserDTOBuilder withLastName(String lName);

    UserDTOBuilder withBirthDay(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    UserDTO build();

    UserDTO getUserDTO();
}
