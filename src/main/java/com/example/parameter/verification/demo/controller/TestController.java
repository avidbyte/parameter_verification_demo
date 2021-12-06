package com.example.parameter.verification.demo.controller;

import com.example.parameter.verification.demo.common.result.CommonResult;
import com.example.parameter.verification.demo.enums.BloodTypeEnum;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;

/**
 *  测试用接口
 * @author aaron
 * @since 2021-12-03
 */
@Validated
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * test
     *
     * @param param 参数
     * @return CommonResult<String>
     */
    @GetMapping("/process")
    CommonResult<String> process(@RequestParam("param") @Min(value = 1,message = "最大值为10") String param) {
        return CommonResult.success(param);
    }


    public static void main(String[] args) {

        for (BloodTypeEnum value : BloodTypeEnum.values()) {
            System.out.println(value.ordinal());
        }

    }

}
