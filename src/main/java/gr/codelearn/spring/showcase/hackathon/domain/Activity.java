package gr.codelearn.spring.showcase.hackathon.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "ACTIVITIES")
public class Activity {
	@EmbeddedId
	private ActivityKey key;

	@ManyToOne
	@MapsId("authorId")
	private Author author;

	@ManyToOne
	@MapsId("contentId")
	private Content content;

	@Column(precision = 10, scale = 2, nullable = false)
	private BigDecimal fee;
}
