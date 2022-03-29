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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity()
@Table(name = "COMMENTS")
@SequenceGenerator(name = "idGenerator", sequenceName = "COMMENTS_SEQ", initialValue = 1, allocationSize = 1)
public class Comment extends BaseModel {
	@Column(length = 4096, nullable = false)
	private String body;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date publishDate;
}
