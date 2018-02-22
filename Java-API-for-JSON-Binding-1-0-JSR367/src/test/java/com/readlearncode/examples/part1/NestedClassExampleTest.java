package com.readlearncode.examples.part1;

import com.readlearncode.examples.part1.domain.OuterClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class NestedClassExampleTest {

    @Test
    public void givenNestedInnerClass_shouldSerializeNestedClasses() {
        String expectedJson = "{\"name\":\"Inner Class\"}";

        NestedClassExample nestedClassExample = new NestedClassExample();
        String actualJson = nestedClassExample.serializeNestedClasses();

        assertThat(actualJson).isEqualTo(expectedJson);
    }

    @Test @Ignore
    public void givenJson_shouldDeserialiseToNestedClass() {

        OuterClass.InnerClass expectedInner = new OuterClass().new InnerClass();

        NestedClassExample nestedClassExample = new NestedClassExample();
        OuterClass.InnerClass actualInnerClass = nestedClassExample.deserialiseNestedClasses();

        assertThat(actualInnerClass).isEqualTo(expectedInner);
    }

}