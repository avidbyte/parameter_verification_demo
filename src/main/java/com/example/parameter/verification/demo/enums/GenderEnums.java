package com.example.parameter.verification.demo.enums;

/**
 * 男女 性别枚举类
 *
 * @author aaron
 * @since 2021-06-22
 */
public enum GenderEnums {

    /**
     * 男
     */
    MALE(1, "男"),
    /**
     * 女
     */
    FEMALE(0, "女");

    /**
     * code
     */
    private final Integer code;

    /**
     * description
     */
    private final String description;

    GenderEnums(int code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * code匹配返回枚举
     *
     * @param code code
     * @return StatusEnums
     */
    public static GenderEnums from(Integer code) {
        for (GenderEnums genderEnums : GenderEnums.values()) {
            if (genderEnums.code.equals(code)) {
                return genderEnums;
            }
        }
        return null;
    }


    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
