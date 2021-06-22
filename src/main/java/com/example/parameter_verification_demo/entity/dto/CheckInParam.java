//package com.example.parameter_verification_demo.entity.dto;
//
//import com.example.parameter_verification_demo.component.EnumValue;
//import lombok.Data;
//
//import javax.validation.Valid;
//import javax.validation.constraints.*;
//import java.util.List;
//
///**
// * 人员登记
// *
// * @author aaron
// * @since 2021-01-19
// */
//@Data
//public class CheckInParam {
//
//
//    public interface Create {
//    }
//
//    public interface Update {
//    }
//
//    /**
//     * 姓名 创建的时候不能为空
//     */
//    @NotBlank(groups = CheckInParam.Create.class,message = "name不能为空")
//    private String name;
//
//    /**
//     * 性别 更新的时候不能为空
//     */
//    @NotNull(groups = CheckInParam.Update.class,message = "sex不能为null")
//    @Pattern(groups = {Create.class, Update.class},regexp = "[0,1]",message = "sex参数非法")
//    private Integer sex;
//
//    /**
//     * 手机号
//     */
//    @Pattern(groups = {Create.class, Update.class},regexp = "^(13[0-9]|14[5|7]|15[0|1|2|3|4|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$",message = "手机号格式不正确")
//    private Integer phoneNumber;
//
//
//    /**
//     * 民族 创建与更新的时候都不能为空
//     */
//    @NotEmpty(groups={CheckInParam.Create.class,CheckInParam.Update.class},message = "nation不能为空")
//    private String nation;
//
//    /**
//     * 是否购买意外险 1是 0否
//     */
//    @EnumValue(groups={CheckInParam.Create.class,CheckInParam.Update.class},enumClass = StatusEnums.class, message = "参数不合法")
//    @NotBlank(message = "isAccidentInsurance不能为空")
//    private String isAccidentInsurance;
//
//    /**
//     * 属性
//     */
//    @Valid
//    @NotNull(groups = CheckInParam.Create.class,message = "attributes不能为空")
//    @Size(groups = CheckInParam.Create.class,min = 1, message = "至少要有一个属性")
//    private List<Attribute> attributes;
//}
