package creation.builder.part2;

import creation.builder.part1.Address;
import creation.builder.part1.UserDTOBuilder;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        UserDTO userDTO = new UserDTO.UserDTOBuilder()
                .withFirstName("김")
                .withLastName("철수")
                .withAddress(new Address())
                .build();

        System.out.println(userDTO.toString());
    }
}
