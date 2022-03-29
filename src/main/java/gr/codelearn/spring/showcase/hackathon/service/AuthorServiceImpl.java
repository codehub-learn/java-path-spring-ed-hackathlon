package gr.codelearn.spring.showcase.hackathon.service;

import gr.codelearn.spring.showcase.hackathon.domain.Activity;
import gr.codelearn.spring.showcase.hackathon.domain.Author;
import gr.codelearn.spring.showcase.hackathon.domain.Content;
import gr.codelearn.spring.showcase.hackathon.repository.ActivityRepository;
import gr.codelearn.spring.showcase.hackathon.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AuthorServiceImpl extends BaseServiceImpl<Author> implements AuthorService {
	private final AuthorRepository authorRepository;
	private final ActivityRepository activityRepository;

	@Override
	public JpaRepository<Author, Long> getRepository() {
		return authorRepository;
	}

	public Author getLazy(Long id) {
		return authorRepository.getLazy(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public void assign(final Author author, final Content content, final BigDecimal cost) {
		Activity newActivity = new Activity(content, author, cost);
		activityRepository.save(newActivity);
		logger.debug("Saved activity {}.", newActivity);
	}
}
