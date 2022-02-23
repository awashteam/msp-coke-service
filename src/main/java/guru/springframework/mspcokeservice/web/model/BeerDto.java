package guru.springframework.mspcokeservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by tg on 2022-02-22.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    public UUID id;
    public Integer version;
    public OffsetDateTime createdDate;

    private OffsetDateTime lastModifiedDate;

    public String beerName;
    private BeerStyleEmun beerStyle;
    private long upc;

    private BigDecimal price;
    private Integer quantityOnHand;
}
