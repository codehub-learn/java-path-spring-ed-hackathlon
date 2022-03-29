package gr.codelearn.spring.showcase.hackathon.bootstrap;

import gr.codelearn.spring.showcase.hackathon.base.BaseComponent;
import gr.codelearn.spring.showcase.hackathon.domain.Author;
import gr.codelearn.spring.showcase.hackathon.domain.BlogPost;
import gr.codelearn.spring.showcase.hackathon.domain.Book;
import gr.codelearn.spring.showcase.hackathon.service.AuthorService;
import gr.codelearn.spring.showcase.hackathon.service.BlogPostService;
import gr.codelearn.spring.showcase.hackathon.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Component
@Profile("generate-content")
@RequiredArgsConstructor
public class SampleContentCreator extends BaseComponent implements CommandLineRunner {
	private final AuthorService authorService;
	private final BookService bookService;
	private final BlogPostService blogPostService;

	@Override
	public void run(final String... args) throws Exception {
		Author a1 = Author.builder().firstname("John").lastname("Papadopoulos").email("jp@gmail.com").build();
		Author a2 = Author.builder().firstname("Nick").lastname("Ioannou").email("ni@gmail.com").build();
		Author a3 = Author.builder().firstname("Peter").lastname("Tsakos").email("pt@gmail.com").build();

		authorService.createAll(a1, a2, a3);
		logger.debug("Saved authors {}, {}, {}.", a1, a2, a3);

		Book b1 = Book.builder().title("Title no1").isbn("111-222-333").pages(500).summary("Test summary").publisher(
				"O'Reilly").year(2010).cost(BigDecimal.valueOf(20.1)).build();
		Book b2 = Book.builder().title("Title no2").isbn("222-333-444").pages(500).summary("Test summary").publisher(
				"Manning").year(2015).cost(BigDecimal.valueOf(20.2)).build();
		Book b3 = Book.builder().title("Title no3").isbn("333-444-555").pages(500).summary("Test summary").publisher(
				"O'Reilly").year(2020).cost(BigDecimal.valueOf(20.3)).build();

		bookService.createAll(b1, b2, b3);
		logger.debug("Saved books {}, {}, {}.", b1, b2, b3);

		BlogPost bp1 = BlogPost.builder().title("post no1").site("blog.somesite.com").publishedAt(
				Date.from(LocalDate.of(2021, 10, 1).atStartOfDay(ZoneId.systemDefault()).toInstant())).build();
		BlogPost bp2 = BlogPost.builder().title("post no2").site("blog.somesite.com").publishedAt(
				Date.from(LocalDate.of(2021, 10, 2).atStartOfDay(ZoneId.systemDefault()).toInstant())).build();
		BlogPost bp3 = BlogPost.builder().title("post no3").site("blog.somesite.com").publishedAt(
				Date.from(LocalDate.of(2021, 10, 3).atStartOfDay(ZoneId.systemDefault()).toInstant())).build();

		blogPostService.createAll(bp1, bp2, bp3);
		logger.debug("Saved blogposts {}, {}, {}.", bp1, bp2, bp3);

		authorService.assign(a1, b1, BigDecimal.valueOf(2001L));
		authorService.assign(a1, b2, BigDecimal.valueOf(2002L));
		authorService.assign(a2, b3, BigDecimal.valueOf(2003L));
		authorService.assign(a1, bp1, BigDecimal.valueOf(201L));
		authorService.assign(a2, bp2, BigDecimal.valueOf(202L));
		authorService.assign(a3, bp3, BigDecimal.valueOf(203L));
	}
}
