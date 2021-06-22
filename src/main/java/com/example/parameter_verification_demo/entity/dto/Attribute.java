package com.example.parameter_verification_demo.entity.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author aaron
 * @since 2021-01-19
 */
@Data
public class Attribute {

    @NotNull(groups = UserInfoDto.Create.class,message = "aid不能为空")
    @Min(value = 1, message = "aid必须为正整数")
    private Integer aId;

    private String aName;

}
