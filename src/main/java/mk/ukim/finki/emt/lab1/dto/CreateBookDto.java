package mk.ukim.finki.emt.lab1.dto;

import mk.ukim.finki.emt.lab1.model.domain.Author;
import mk.ukim.finki.emt.lab1.model.domain.Book;
import mk.ukim.finki.emt.lab1.model.enumerations.Category;

public record CreateBookDto(String name, Category category, Long authorId, Integer availableCopies) {

    public Book toBook(Author author) {
        return new Book(name, category, author, availableCopies);
    }
}