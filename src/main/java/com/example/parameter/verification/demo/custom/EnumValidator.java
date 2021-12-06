package com.example.parameter.verification.demo.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Method;

/**
 * @author aaron
 * @since 2021-08-15
 */
public class EnumValidator implements ConstraintValidator<EnumValue, Object> {


    private EnumValue annotation;

    @Override
    public void initialize(EnumValue constraintAnnotation) {
        this.annotation = constraintAnnotation;
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }

        Object[] objects = annotation.clazz().getEnumConstants();

        try {
            Method method = annotation.clazz().getMethod(annotation.method());
            for (Object o : objects) {
                Object obj = method.invoke(o);
                // 支持 枚举类 code 为 String 和 Integer 类型的 值
                if (obj instanceof String) {
                    String code = (String) obj;
                    return code.equals(value);
                }
                if (obj instanceof Integer) {
                    Integer code = (Integer) obj;
                    return code.equals(value);
                }
                return false;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
