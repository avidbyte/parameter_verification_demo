package com.example.parameter.verification.demo.custom.test3;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

/**
 * @author aaron
 * @since 2021-08-15
 */
@Data
public class BindingAccount {


    @Pattern(regexp = "[1-9][0-9]{4,}",message = "QQ号格式错误")
    private Integer QQ;


    @Pattern(regexp = "^1[0-9]{10}$",message = "手机号格式错误")
    private Integer phoneNumber;

    @Pattern(regexp = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$\n",message = "邮箱格式错误")
    @Email(message = "邮箱格式错误")
    private String mailbox;

}
