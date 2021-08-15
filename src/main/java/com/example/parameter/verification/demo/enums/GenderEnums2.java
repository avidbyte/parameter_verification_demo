package com.example.parameter.verification.demo.enums;

/**
 * 男女 性别枚举类
 *
 * @author aaron
 * @since 2021-06-22
 */
public enum GenderEnums2 {

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
    private final int value;

    /**
     * description
     */
    private final String desc;

    GenderEnums2(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

}
