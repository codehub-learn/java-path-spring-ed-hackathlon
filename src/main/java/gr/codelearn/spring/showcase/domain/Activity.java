package gr.codelearn.spring.showcase.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
public class Activity extends BaseModel {
	private Content content;
	private BigDecimal fee;
}
