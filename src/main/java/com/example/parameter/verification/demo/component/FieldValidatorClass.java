package com.example.parameter.verification.demo.component;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 数据范围状态校验器
 *
 * @author aaron
 * @since 2021-08-11
 */
public class FieldValidatorClass implements ConstraintValidator<FieldValidator, Integer> {
    private String[] values;

    @Override
    public void initialize(FieldValidator constraintAnnotation) {
        this.values = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        boolean isValid = false;
        if (value == null) {
            //当状态为空时使用默认值
            return true;
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(String.valueOf(value))) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }
}
