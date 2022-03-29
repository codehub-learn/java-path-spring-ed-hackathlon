package gr.codelearn.spring.showcase.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.Set;

@Data
@SuperBuilder
public class BlogPost extends Content {
	private Date publishDate;
	private String site;
	private Set<Comment> comments;
}
