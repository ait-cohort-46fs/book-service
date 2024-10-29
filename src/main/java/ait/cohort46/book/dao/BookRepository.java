package ait.cohort46.book.dao;

import ait.cohort46.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Stream;

public interface BookRepository extends JpaRepository<Book, String> {
    Stream<Book> findByAuthorsNameIgnoreCase(String name);

    Stream<Book> findByPublisherPublisherName(String publisherName);

    void deleteByAuthorsNameIgnoreCase(String name);
}
