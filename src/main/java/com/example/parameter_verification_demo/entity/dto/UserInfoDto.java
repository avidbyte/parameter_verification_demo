package com.example.parameter_verification_demo.entity.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 用户信息
 *
 * @author aaron
 * @since 2021-06-22
 */
@Data
public class UserInfoDto {

    public interface Create {
    }

    public interface Update {
    }


    /**
     * 姓名
     */
    @NotBlank(groups = UserInfoDto.Create.class, message = "姓名不能为空")
    private String name;

    /**
     * 性别
     */
    @NotNull(groups = {Create.class, Update.class}, message = "gender不能为null")
    @Pattern(groups = {Create.class, Update.class}, regexp = "[0,1]", message = "性别参数非法")
    private Integer gender;

    /**
     * 手机号
     */
    @Pattern(groups = {Create.class, Update.class}, regexp = "^(13[0-9]|14[5|7]|15[0|1|2|3|4|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$", message = "手机号格式不正确")
    private Integer phoneNumber;

    /**
     * 邮箱
     */
    @Email(groups = {Create.class, Update.class}, message = "邮箱格式不正确")
    private String email;


}
