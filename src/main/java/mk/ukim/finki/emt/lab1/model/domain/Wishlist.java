package mk.ukim.finki.emt.lab1.model.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Wishlist {
    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Book book;

    // Constructors
    public Wishlist() {
    }

    public Wishlist(User user, Book book) {
        this.user = user;
        this.book = book;
    }

}
