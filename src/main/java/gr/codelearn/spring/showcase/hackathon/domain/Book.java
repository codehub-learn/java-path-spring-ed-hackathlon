package gr.codelearn.spring.showcase.hackathon.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity()
@Table(name = "BOOKS")
@SequenceGenerator(name = "idGenerator", sequenceName = "BOOKS_SEQ", initialValue = 1, allocationSize = 1)
public class Book extends Content {
	@Column(length = 1024, nullable = false)
	private String summary;

	@Column(length = 30, nullable = false)
	private String isbn;

	@Column(nullable = false)
	private Integer year;

	@Column(length = 50, nullable = false)
	private String publisher;

	@Column(nullable = true)
	private Integer pages;

	@Column(precision = 10, scale = 2, nullable = false)
	private BigDecimal cost;
}
