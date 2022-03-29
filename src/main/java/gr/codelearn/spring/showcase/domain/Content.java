package gr.codelearn.spring.showcase.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Content extends BaseModel {
	private String title;
}
