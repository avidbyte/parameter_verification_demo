package com.example.parameter.verification.demo.entity.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author aaron
 * @since 2021-06-24
 */
@Data
public class SubjectProductRelation {


    private Long id;

    @NotNull(groups = {ProductParam.Create.class}, message = "专题id不能为空")
    private Long subjectId;
    @NotNull(groups = {ProductParam.Create.class}, message = "商品id不能为空")
    private Long productId;

}
