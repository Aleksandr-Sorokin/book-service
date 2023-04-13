package ru.sorokin.serverbook.author.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sorokin.serverbook.book.model.Book;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {
    private String name;
    private String lastName;
    private String nickname;
    private Set<Book> books = new HashSet<>();
}
