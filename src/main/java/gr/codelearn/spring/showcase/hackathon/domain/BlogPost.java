package gr.codelearn.spring.showcase.hackathon.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity()
@Table(name = "BLOGPOSTS")
@SequenceGenerator(name = "idGenerator", sequenceName = "BLOGPOSTS_SEQ", initialValue = 1, allocationSize = 1)
public class BlogPost extends Content {
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date publishedAt;

	@Column(length = 50, nullable = false)
	private String site;

	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(orphanRemoval = true)
	@JoinColumn(name = "BLOGPOST_ID")
	private Set<Comment> comments = new HashSet<>();
}
