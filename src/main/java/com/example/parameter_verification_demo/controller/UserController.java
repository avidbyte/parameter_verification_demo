package com.example.parameter_verification_demo.controller;

import com.example.parameter_verification_demo.common.result.CommonResult;
import com.example.parameter_verification_demo.entity.dto.UserInfoDto;
import com.example.parameter_verification_demo.entity.param.PasswordParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 用户相关接口
 *
 * @author aaron
 * @since 2021-01-19
 */

@Validated
@RestController
@RequestMapping("/user")
public class UserController {


    /**
     * 设置密码
     *
     * @param passwordParam 密码+
     * @return CommonResult<Boolean>
     */
    @PostMapping("/setPassword")
    CommonResult<String> create(@RequestBody @Validated PasswordParam passwordParam) {
        String password = passwordParam.getPassword();
        return CommonResult.success(password);
    }


    /**
     * 更新用户信息
     * @param userInfoDto 用户信息对象
     * @return CommonResult<String>
     */
    @PutMapping("/updateUserInfo")
    CommonResult<String> updateUserInfo(@RequestBody @Validated(UserInfoDto.Update.class) UserInfoDto userInfoDto) {
        String name = userInfoDto.getName();
        return CommonResult.success(name);
    }


}
