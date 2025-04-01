package mk.ukim.finki.emt.lab1.dto;

import mk.ukim.finki.emt.lab1.model.domain.User;
import mk.ukim.finki.emt.lab1.model.enumerations.Role;

public record DisplayUserDto(
        String username,
        String name,
        String surname,
        Role role
) {
    public static DisplayUserDto from(User user) {
        return new DisplayUserDto(
                user.getUsername(),
                user.getName(),
                user.getSurname(),
                user.getRole()
        );
    }
}
