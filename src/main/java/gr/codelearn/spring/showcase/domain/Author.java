package gr.codelearn.spring.showcase.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Data
@SuperBuilder
public class Author extends BaseModel {
	private String firstname;
	private String lastname;
	private String email;
	private Set<Activity> activities;
}
