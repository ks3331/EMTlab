package mk.ukim.finki.emt.lab1.dto;

import mk.ukim.finki.emt.lab1.model.domain.User;
import mk.ukim.finki.emt.lab1.model.enumerations.Role;

public record CreateUserDto(
        String username,
        String password,
        String repeatPassword,
        String name,
        String surname,
        Role role
) {}