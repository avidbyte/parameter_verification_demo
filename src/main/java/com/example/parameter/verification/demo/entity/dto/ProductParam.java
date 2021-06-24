package com.example.parameter.verification.demo.entity.dto;

import com.example.parameter.verification.demo.component.ValidList;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 商品简略参数
 *
 * @author aaron
 * @since 2021-06-24
 */
@Data
public class ProductParam {

    public interface Create {
    }

    public interface Update {
    }

    /**
     * 唯一id
     */
    @NotBlank(groups = {Update.class}, message = "商品名称不能为空")
    private String uid;

    /**
     * 商品名称
     */
    @NotBlank(groups = {Create.class}, message = "商品名称不能为空")
    private String name;
    /**
     * 库存
     */
    @NotNull(groups = {Create.class}, message = "请输入库存数量")
    private Integer stock;

    /**
     * 单位
     */
    @NotBlank(groups = {Create.class}, message = "单位不能为空")
    private String unit;

    /**
     * 商品描述
     */
    @NotBlank(groups = {Create.class}, message = "商品描述不能为空")
    private String description;

    /**
     * 商品扩展信息
     */
    @Valid
    @NotNull(groups = {Create.class}, message = "商品扩展信息不能为空")
    private ProductExtensionInfoDto productExtensionInfoDto;

    /**
     * 商品与专题关系
     */
    @Valid
    @NotNull(groups = {Create.class}, message = "商品与专题关系集合不能为null")
    @Size(min = 1,message = "请选择商品专题")
    private ValidList<SubjectProductRelation> subjectProductRelationList;

}
