package mk.ukim.finki.emt.lab1.config;

import jakarta.annotation.PostConstruct;

import mk.ukim.finki.emt.lab1.model.domain.Author;
import mk.ukim.finki.emt.lab1.model.domain.Book;
import mk.ukim.finki.emt.lab1.model.domain.Country;
import mk.ukim.finki.emt.lab1.model.domain.User;
import mk.ukim.finki.emt.lab1.model.enumerations.Category;
import mk.ukim.finki.emt.lab1.model.enumerations.Role;
import mk.ukim.finki.emt.lab1.repository.AuthorRepository;
import mk.ukim.finki.emt.lab1.repository.BookRepository;
import mk.ukim.finki.emt.lab1.repository.CountryRepository;
import mk.ukim.finki.emt.lab1.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer {

    private final CountryRepository countryRepository;
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DataInitializer(
            CountryRepository countryRepository,
            AuthorRepository authorRepository,
            BookRepository bookRepository,
            UserRepository userRepository,
            PasswordEncoder passwordEncoder
    ) {
        this.countryRepository = countryRepository;
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void init() {

        // Add countries
        Country usa = countryRepository.save(new Country("USA", "North America"));
        Country uk = countryRepository.save(new Country("UK", "Europe"));
        Country france = countryRepository.save(new Country("France", "Europe"));
        Country germany = countryRepository.save(new Country("Germany", "Europe"));
        Country japan = countryRepository.save(new Country("Japan", "Asia"));
        Country italy = countryRepository.save(new Country("Italy", "Europe"));

        // Add authors
        Author author1 = authorRepository.save(new Author("George", "Orwell", usa));
        Author author2 = authorRepository.save(new Author("J.K.", "Rowling", uk));
        Author author3 = authorRepository.save(new Author("Victor", "Hugo", france));
        Author author4 = authorRepository.save(new Author("Hermann", "Hesse", germany));
        Author author5 = authorRepository.save(new Author("Haruki", "Murakami", japan));
        Author author6 = authorRepository.save(new Author("Dante", "Alighieri", italy));

        // Add books
        bookRepository.saveAll(List.of(
                new Book("1984", Category.NOVEL, author1, 5),
                new Book("Harry Potter", Category.FANTASY, author2, 10),
                new Book("Les Misérables", Category.DRAMA, author3, 8),
                new Book("Siddhartha", Category.CLASSICS, author4, 6),
                new Book("Norwegian Wood", Category.DRAMA, author5, 12),
                new Book("The Divine Comedy", Category.CLASSICS, author6, 4),
                new Book("Animal Farm", Category.NOVEL, author1, 7),
                new Book("Kafka on the Shore", Category.FANTASY, author5, 9),
                new Book("The Glass Bead Game", Category.CLASSICS, author4, 5),
                new Book("The Hunchback of Notre-Dame", Category.DRAMA, author3, 3)
        ));

        // Add users
        userRepository.save(new User(
                "admin",
                passwordEncoder.encode("admin123"),
                "Admin",
                "Admin",
                Role.ROLE_LIBRARIAN
        ));

        userRepository.save(new User(
                "user",
                passwordEncoder.encode("user123"),
                "User",
                "User",
                Role.ROLE_USER
        ));
    }
}