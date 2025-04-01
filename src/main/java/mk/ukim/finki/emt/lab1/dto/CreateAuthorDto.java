package mk.ukim.finki.emt.lab1.dto;

import mk.ukim.finki.emt.lab1.model.domain.Author;
import mk.ukim.finki.emt.lab1.model.domain.Country;

public record CreateAuthorDto(String name, String surname, Long countryId) {

    public Author toAuthor(Country country) {
        return new Author(name, surname, country);
    }
}