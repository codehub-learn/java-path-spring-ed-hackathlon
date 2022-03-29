package gr.codelearn.spring.showcase.hackathon.service;

import gr.codelearn.spring.showcase.hackathon.domain.Author;
import gr.codelearn.spring.showcase.hackathon.domain.Content;

import java.math.BigDecimal;

public interface AuthorService extends BaseService<Author, Long> {
	Author getLazy(Long id);

	void assign(Author author, Content content, BigDecimal cost);
}
