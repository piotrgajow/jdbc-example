package domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Book {

    private Long id;
    private String title;
    private Boolean hasHardCover;
    private Integer numberOfPages;
    private LocalDate releaseDate;

}
