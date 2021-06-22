package com.example.parameter_verification_demo.enums;

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
    private final int code;

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
    public static GenderEnums from(int code) {
        for (GenderEnums genderEnums : GenderEnums.values()) {
            if (genderEnums.code == code) {
                return genderEnums;
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
    public static boolean isValidEnum(int code) {
        for (GenderEnums genderEnums : GenderEnums.values()) {
            if (genderEnums.code == code) {
                return true;
            }
        }
        return false;
    }


    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
