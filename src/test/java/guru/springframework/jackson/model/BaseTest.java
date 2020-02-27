package guru.springframework.jackson.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {
    BeerDto getDto() {
        return BeerDto.builder()
                .beerName("beer name")
                .beerStyle("ale")
                .id(UUID.randomUUID())
                .created(OffsetDateTime.now())
                .modified(OffsetDateTime.now())
                .price(new BigDecimal("123.22"))
                .upc(123456L)
                .build();
    }
}
