package gr.codelearn.spring.showcase.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@NoArgsConstructor
@SuperBuilder
public class Comment extends BaseModel {
	private String body;
	private Date publishDate;
}
