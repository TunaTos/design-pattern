package creation.builder.part1;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();

        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    // Director
    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthDay(user.getBirthday())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiand");
        address.setZipCode("47998");
        user.setAddress(address);
        return user;
    }
}
