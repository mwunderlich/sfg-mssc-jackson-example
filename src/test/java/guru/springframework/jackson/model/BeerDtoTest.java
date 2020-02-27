package guru.springframework.jackson.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
public class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserializeDto() throws Exception {
        String jsonString = "{\"id\":\"30e637c8-87c0-46ec-9038-33676a624e6a\",\"beerName\":\"beer name\",\"beerStyle\":\"ale\",\"upc\":123456,\"price\":123.22,\"created\":\"2020-02-27T07:42:19.122+01:00\",\"modified\":\"2020-02-27T07:42:19.127+01:00\"}\n";

        BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);

        System.out.println(beerDto);
    }
}
