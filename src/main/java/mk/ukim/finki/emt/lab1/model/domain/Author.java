package mk.ukim.finki.emt.lab1.model.domain;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Entity
@Data
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;

    @ManyToOne
    private Country country;

    public Author(String name, String surname, Country country) {
    }

    public Author() {

    }

    public Author(Long id, String name, String surname, Country country) {

    }

}
