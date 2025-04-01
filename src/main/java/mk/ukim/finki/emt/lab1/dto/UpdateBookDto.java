package mk.ukim.finki.emt.lab1.dto;

import mk.ukim.finki.emt.lab1.model.domain.Author;
import mk.ukim.finki.emt.lab1.model.domain.Book;
import mk.ukim.finki.emt.lab1.model.enumerations.Category;

public record UpdateBookDto(String name, Category category, Long authorId, Integer availableCopies) {

    public Book toBook(Long id, Author author) {
        return new Book(id, name, category, author, availableCopies);
    }
}