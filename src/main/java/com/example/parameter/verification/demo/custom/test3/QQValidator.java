package com.example.parameter.verification.demo.custom.test3;

import org.hibernate.validator.internal.util.logging.Log;
import org.hibernate.validator.internal.util.logging.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.invoke.MethodHandles;

/**
 *  QQ号验证器
 * @author aaron
 * @since 2021-08-15
 */
public class QQValidator implements ConstraintValidator<QQ,Object> {

    private static final Log LOG = LoggerFactory.make( MethodHandles.lookup() );

    private java.util.regex.Pattern pattern;


    @Override
    public void initialize(QQ constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        pattern = java.util.regex.Pattern.compile("[1-9][0-9]{4,}");
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return false;
    }
}
