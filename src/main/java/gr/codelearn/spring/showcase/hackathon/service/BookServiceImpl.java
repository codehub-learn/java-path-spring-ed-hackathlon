package gr.codelearn.spring.showcase.hackathon.service;

import gr.codelearn.spring.showcase.hackathon.domain.Book;
import gr.codelearn.spring.showcase.hackathon.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BookServiceImpl extends BaseServiceImpl<Book> implements BookService {
	private final BookRepository bookRepository;

	@Override
	public JpaRepository<Book, Long> getRepository() {
		return bookRepository;
	}
}
