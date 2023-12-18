package com.accolite.Assignment1;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotation for class-level documentation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ClassDocumentation {
    String value() default ""; // Optional description for the class
}

// Annotation for method-level documentation


