package gr.codelearn.spring.showcase.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@SuperBuilder
public class Activity extends BaseModel {
	private Content content;
	private BigDecimal fee;
}
