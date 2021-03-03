package com.example.parameter_verification_demo.enums;

/**
 * 状态 枚举类
 *
 * @author aaron
 * @since 2021-01-19
 */
public enum StatusEnums {

    /**
     * 状态类型
     */
    YES("1", "是"),
    NO("0", "否");

    /**
     * code
     */
    private String code;

    /**
     * description
     */
    private String description;

    StatusEnums(String code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * code匹配返回枚举
     *
     * @param code code
     * @return StatusEnums
     */
    public static StatusEnums from(String code) {
        for (StatusEnums statusEnums : StatusEnums.values()) {
            if (statusEnums.code.equals(code)) {
                return statusEnums;
            }
        }
        return null;
    }

    /**
     * 判断code 是否符合枚举类中的code
     *
     * @param code code
     * @return boolean
     */
    public static boolean isValidEnum(String code) {
        for (StatusEnums statusEnums : StatusEnums.values()) {
            if (statusEnums.code.equals(code)) {
                return true;
            }
        }
        return false;
    }


    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
