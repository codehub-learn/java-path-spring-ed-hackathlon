package gr.codelearn.spring.showcase.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
public class Book extends Content {
	private String summary;
	private String isbn;
	private Integer year;
	private Integer page;
	private String publisher;
	private BigDecimal cost;
}
