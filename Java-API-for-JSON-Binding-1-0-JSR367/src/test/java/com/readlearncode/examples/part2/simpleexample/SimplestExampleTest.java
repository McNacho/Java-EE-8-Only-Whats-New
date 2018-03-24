package com.readlearncode.examples.part2.simpleexample;

import org.junit.Test;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyNamingStrategy;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class SimplestExampleTest {

    @Test
    public void givenBookObject_shouldSerialise() {
        String expectedJson = "{\"title\":\"Fun with Java\"}";

        Book book = new Book();
        book.title = "Fun with Java";

        String actualJson = JsonbBuilder.create().toJson(book);

        assertThat(actualJson).isEqualTo(expectedJson);

        /*
            {
              "title": "Fun with Java"
            }
         */
    }

    @Test
    public void givenBookJson_shouldDeserialiseToBookObject() {

        Book expectedBook = new Book();
        expectedBook.title = "Fun with Java";

        String json = "{\"title\":\"Fun with Java\"}";

        Book actualBook = JsonbBuilder.create().fromJson(json, Book.class);

        assertThat(actualBook.title).isEqualTo(expectedBook.title);





    }

}