//package com.example.parameter_verification_demo.controller;
//
///**
// * @author aaron
// * @since 2021-03-02
// */
//
//import com.example.parameter_verification_demo.common.result.CommonResult;
//import com.example.parameter_verification_demo.component.ValidList;
//import com.example.parameter_verification_demo.entity.dto.CheckInParam;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
///**
// * 人员登记
// *
// * @author aaron
// * @since 2021-01-19
// */
//@Validated
//@RestController
//@RequestMapping("/checkin")
//public class CheckInController {
//
//    /**
//     * 人员登记
//     *
//     * @param checkInParam 人员登记参数
//     * @return CommonResult<Boolean>
//     */
//    @PostMapping("/create")
//    CommonResult<String> create(@RequestBody @Validated(CheckInParam.Create.class)  CheckInParam checkInParam) {
//        String name = checkInParam.getName();
//        return CommonResult.success(name);
//    }
//
//    /**
//     * 人员批量登记
//     * @param checkInParamList 人员登记参数集合
//     * @return CommonResult<String>
//     */
//    @PostMapping("/createList")
//    CommonResult<String> createList(@RequestBody  @Validated(CheckInParam.Create.class) ValidList<CheckInParam> checkInParamList) {
//        String name =  checkInParamList.get(0).getName();
//        return CommonResult.success(name);
//    }
//
//}
