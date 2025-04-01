package mk.ukim.finki.emt.lab1.dto;

import mk.ukim.finki.emt.lab1.model.domain.Book;
import mk.ukim.finki.emt.lab1.model.enumerations.Category;

import java.util.List;
import java.util.stream.Collectors;

public record DisplayBookDto(Long id, String name, Category category, Long authorId, Integer availableCopies) {

    public static DisplayBookDto from(Book book) {
        return new DisplayBookDto(book.getId(), book.getName(), book.getCategory(), book.getAuthor().getId(), book.getAvailableCopies());
    }

    public static List<DisplayBookDto> from(List<Book> books) {
        return books.stream().map(DisplayBookDto::from).collect(Collectors.toList());
    }
}