package mk.ukim.finki.emt.lab1.dto;

import mk.ukim.finki.emt.lab1.model.domain.Country;

public record UpdateCountryDto(String name, String continent) {

    public Country toCountry(Long id) {
        return new Country( name, continent);
    }
}