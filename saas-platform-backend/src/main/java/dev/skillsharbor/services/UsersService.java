package dev.skillsharbor.services;

import dev.skillsharbor.entities.Users;

import java.util.Set;

public interface UsersService {

    //CREATE
    Book registerBook(Book book);

    //READ
    Book getBookById(int id);
    Set<Book> getAllBooks();

    //UPDATE
    Book updateBook(Book book);

    //Delete
    boolean deleteBookById(int id);


}