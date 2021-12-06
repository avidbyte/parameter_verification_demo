package com.example.parameter.verification.demo.entity.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 *  扩展信息对象
 * @author aaron
 * @since 2021-06-24
 */
@Data
public class ProductExtensionInfoDTO {

    /**
     * 商品价格
     */
    @NotNull(groups = ProductParam.Create.class,message = "商品价格不能为空")
    @Min(groups = {ProductParam.Create.class,ProductParam.Update.class},value = 0,message = "商品价格应大于0")
    private BigDecimal fullPrice;

    /**
     * 会员价
     */
    @NotNull(groups = ProductParam.Create.class,message = "会员价格不能为空")
    @Min(groups = {ProductParam.Create.class,ProductParam.Update.class},value = 0,message = "会员价格应大于0")
    private BigDecimal memberPrice;

}
