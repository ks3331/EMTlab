package mk.ukim.finki.emt.lab1.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class CountryDto {
    private String name;
    private String code;

    public CountryDto() {}

    public CountryDto(String name, String code) {
        this.name = name;
        this.code = code;
    }

}
