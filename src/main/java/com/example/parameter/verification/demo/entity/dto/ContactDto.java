package com.example.parameter.verification.demo.entity.dto;

import lombok.Data;

/**
 * 联系人
 * @author aaron
 * @since 2021-06-22
 */
@Data
public class ContactDto {

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 手机号
     */
    private Integer phoneNumber;
}
