package com.readlearncode.examples.part1;

import com.readlearncode.examples.part1.domain.Booklet;
import org.junit.Test;

import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class BookletAdapterTest {

    @Test
    public void givenJSON_shouldUseAdapterToDeserialise() {
        String actualJson = "{\"title\":\"Fun with Java\",\"firstName\":\"Alex\",\"lastName\":\"Theedom\"}";
        Booklet actualBooklet = new Booklet("Fun with Java", "Alex", "Theedom");
        JsonbConfig config = new JsonbConfig().withAdapters(new BookletAdapter());
        Booklet expectedBooklet = JsonbBuilder.create(config).fromJson(actualJson, Booklet.class);

        assertThat(actualBooklet).isEqualTo(expectedBooklet);
    }

    @Test
    public void givenBookObject_shouldUseAdapterToSerialise() {
        String expectedJson = "{\"title\":\"Fun with Java\",\"firstName\":\"Alex\",\"lastName\":\"Theedom\"}";
        Booklet booklet = new Booklet("Fun with Java", "Alex", "Theedom");
        JsonbConfig config = new JsonbConfig().withAdapters(new BookletAdapter());
        String actualJson = JsonbBuilder.create(config).toJson(booklet);

        assertThat(actualJson).isEqualTo(expectedJson);
    }

}