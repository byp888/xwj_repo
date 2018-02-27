package com.demo.template.domain;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;


import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, METHOD})
@Retention(RUNTIME)
public @interface TestAnno {
	
	String value();
	
	String[] type() default {};
}
