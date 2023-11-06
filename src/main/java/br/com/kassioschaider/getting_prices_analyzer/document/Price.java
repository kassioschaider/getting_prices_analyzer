package br.com.kassioschaider.getting_prices_analyzer.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Price {

    @Id
    private String id;
    private String sellerTag;
    private BigDecimal value;
}
