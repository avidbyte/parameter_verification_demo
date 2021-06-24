package com.example.parameter.verification.demo.entity.dto;

import com.example.parameter.verification.demo.component.EnumValue;
import com.example.parameter.verification.demo.enums.GenderEnums;
import lombok.Data;

/**
 *  枚举参数  用于测试 枚举类校验
 * @author aaron
 * @since 2021-06-24
 */
@Data
public class EnumsParam {

    /**
     * code
     */
    @EnumValue(enumClass = GenderEnums.class,message = "性别参数非法")
    private String code;

}
