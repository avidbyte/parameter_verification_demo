package com.example.parameter_verification_demo.entity.param;

import com.example.parameter_verification_demo.component.EnumValue;
import com.example.parameter_verification_demo.enums.StatusEnums;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * 人员登记
 *
 * @author aaron
 * @since 2021-01-19
 */
@Data
public class CheckInParam {


    public interface Create {
    }

    public interface Update {
    }

    /**
     * 姓名 创建的时候不能为空
     */
    @NotBlank(groups = CheckInParam.Create.class,message = "name不能为空")
    private String name;

    /**
     * 性别 更新的时候不能为空
     */
    @NotBlank(groups = CheckInParam.Update.class,message = "sex不能为空")
    private String sex;

    /**
     * 民族 创建与更新的时候都不能为空
     */
    @NotEmpty(groups={CheckInParam.Create.class,CheckInParam.Update.class},message = "nation不能为空")
    private String nation;

    /**
     * 是否购买意外险 1是 0否
     */
    @EnumValue(groups={CheckInParam.Create.class,CheckInParam.Update.class},enumClass = StatusEnums.class, message = "参数不合法")
    @NotBlank(message = "isAccidentInsurance不能为空")
    private String isAccidentInsurance;

    /**
     * 属性
     */
    @Valid
    @NotNull(groups = CheckInParam.Create.class,message = "attributes不能为空")
    @Size(groups = CheckInParam.Create.class,min = 1, message = "至少要有一个属性")
    private List<Attribute> attributes;
}
