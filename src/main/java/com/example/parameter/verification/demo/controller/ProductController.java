package com.example.parameter.verification.demo.controller;

import com.example.parameter.verification.demo.common.result.CommonResult;
import com.example.parameter.verification.demo.component.ValidList;
import com.example.parameter.verification.demo.entity.dto.EnumsParam;
import com.example.parameter.verification.demo.entity.dto.ProductParam;
import com.example.parameter.verification.demo.entity.dto.SubjectProductRelation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;

/**
 * 商品管理
 *
 * @author aaron
 * @since 2021-06-24
 */

@Validated
@RestController
@RequestMapping("/product")
public class ProductController {


    /**
     * 创建商品
     *
     * @param productParam 商品参数
     * @return CommonResult<String>
     */
    @PostMapping("/create")
    CommonResult<String> create(@RequestBody @Validated(ProductParam.Create.class) ProductParam productParam) {
        String name = productParam.getName();
        return CommonResult.success(name);
    }


    /**
     * 更新商品信息
     *
     * @param productParam 商品参数
     * @return CommonResult<String>
     */
    @PatchMapping("/update")
    CommonResult<String> update(@RequestBody @Validated(ProductParam.Update.class) ProductParam productParam) {
        String uid = productParam.getUid();
        return CommonResult.success(uid);
    }

    /**
     * 商品关联专题接口
     *
     * @param subjectProductRelationList 商品专题关联关系集合
     * @return CommonResult<String>
     */
    @PostMapping("/subjectAssociated")
    CommonResult<String> subjectAssociated(@RequestBody @NotEmpty(message = "商品专题关联关系集合不能为空") @Validated(ProductParam.Create.class) ValidList<SubjectProductRelation> subjectProductRelationList) {
        int size = subjectProductRelationList.size();
        return CommonResult.success(Integer.toString(size));
    }


    /**
     * 枚举参数校验测试接口
     *
     * @param enumsParam 枚举测试对象
     * @return CommonResult<String>
     */
    @PostMapping("/enumsTest")
    CommonResult<String> enumsTest(@RequestBody @Validated EnumsParam enumsParam) {
        Integer code = enumsParam.getGender();
        String bloodType = enumsParam.getBloodType();
        return CommonResult.success(bloodType);
    }


}
