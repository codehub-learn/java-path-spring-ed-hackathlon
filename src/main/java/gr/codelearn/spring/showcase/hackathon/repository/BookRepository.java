package gr.codelearn.spring.showcase.hackathon.repository;

import gr.codelearn.spring.showcase.hackathon.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
