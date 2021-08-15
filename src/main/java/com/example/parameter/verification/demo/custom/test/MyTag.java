package com.example.parameter.verification.demo.custom.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author aaron
 * @since 2021-08-14
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyTag {
    //定义带一个成员变量的注解
    //注解中的成员变量以方法的形式来定义
    String value() default "0";
}
