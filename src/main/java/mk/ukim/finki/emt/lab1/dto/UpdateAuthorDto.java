package mk.ukim.finki.emt.lab1.dto;

import mk.ukim.finki.emt.lab1.model.domain.Author;
import mk.ukim.finki.emt.lab1.model.domain.Country;

public record UpdateAuthorDto(String name, String surname, Long countryId) {

    public Author toAuthor(Long id, Country country) {
        return new Author(id, name, surname, country);
    }
}