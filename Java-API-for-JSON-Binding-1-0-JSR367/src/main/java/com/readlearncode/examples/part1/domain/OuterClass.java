package com.readlearncode.examples.part1.domain;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class OuterClass {
    public OuterClass() {}
    public String name = "OuterClass";
    public class InnerClass {
        public InnerClass() {}
        public String name = "Inner Class";
    }
}