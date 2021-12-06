package com.example.parameter.verification.demo.custom;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author aaron
 * @since 2021-08-15
 */

@Documented
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Repeatable(EnumValue.List.class)
@Constraint(validatedBy = {EnumValidator.class})
public @interface EnumValue {

    String message() default "{enum.value.invalid}"; // 错误信息

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


    Class<?> clazz();

    String method() default "getCode";


    @Documented
    @Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
    @Retention(RUNTIME)
    @interface List {
        EnumValue[] value();
    }
}
