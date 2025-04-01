package mk.ukim.finki.emt.lab1.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class AuthorDto {
    private String firstName;
    private String lastName;
    private Long countryId;

    public AuthorDto() {}

    public AuthorDto(String firstName, String lastName, Long countryId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.countryId = countryId;
    }

}
