package gr.codelearn.spring.showcase.hackathon.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity()
@Table(name = "AUTHORS")
@SequenceGenerator(name = "idGenerator", sequenceName = "AUTHORS_SEQ", initialValue = 1, allocationSize = 1)
public class Author extends BaseModel {
	@Column(length = 20, nullable = false)
	private String firstname;

	@Column(length = 30, nullable = false)
	private String lastname;

	@Column(length = 50, nullable = false)
	private String email;

	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy = "author")
	private Set<Activity> activities = new HashSet<>();
}
