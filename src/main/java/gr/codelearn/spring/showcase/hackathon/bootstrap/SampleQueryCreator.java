package gr.codelearn.spring.showcase.hackathon.bootstrap;

import gr.codelearn.spring.showcase.hackathon.base.BaseComponent;
import gr.codelearn.spring.showcase.hackathon.domain.Author;
import gr.codelearn.spring.showcase.hackathon.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SampleQueryCreator extends BaseComponent implements CommandLineRunner {
	private final AuthorService authorService;

	@Override
	public void run(final String... args) throws Exception {
		Author author = authorService.get(1L);
		logger.debug("Loaded author {}.", author);
		Author authorWithActivities = authorService.getLazy(1L);
		logger.debug("Loaded authorWithActivities {}.", authorWithActivities);
		authorWithActivities.getActivities().forEach(c -> logger.debug("Content {}.", c));

	}
}
