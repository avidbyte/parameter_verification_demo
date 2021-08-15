package com.example.parameter.verification.demo.custom.test3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author aaron
 * @since 2021-08-15
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface QQ {

    String value() default "[1-9][0-9]{4,}";

}
