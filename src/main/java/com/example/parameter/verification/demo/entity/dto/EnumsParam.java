package com.example.parameter.verification.demo.entity.dto;

import com.example.parameter.verification.demo.custom.EnumValue;
import com.example.parameter.verification.demo.enums.BloodTypeEnum;
import com.example.parameter.verification.demo.enums.GenderEnums;
import lombok.Data;

/**
 * 枚举参数  用于测试 枚举类校验
 *
 * @author aaron
 * @since 2021-06-24
 */
@Data
public class EnumsParam {

    /**
     * code
     */

    @EnumValue(clazz = GenderEnums.class, message = "性别参数非法")
    private Integer gender;


    @EnumValue(clazz = BloodTypeEnum.class, message = "血型参数非法")
    private String bloodType;


}
