package com.example.parameter.verification.demo.enums;

/**
 * @author aaron
 * @since 2021-01-19
 */
public enum BloodTypeEnum {

    /**
     * 血型
     */
    A("A","A型血"),
    B("B","B型血"),
    AB("AB","AB型血"),
    O("O","O型血");

    /**
     * code
     */
    private String code;

    /**
     * description
     */
    private String description;

    BloodTypeEnum(String code, String description){
        this.code = code;
        this.description = description;
    }

    public static BloodTypeEnum from(String code){
        for (BloodTypeEnum bloodTypeEnum : BloodTypeEnum.values()){
            if (bloodTypeEnum.code.equals(code)){
                return bloodTypeEnum;
            }
        }
        return null;
    }

    public String getCode(){
        return code;
    }

    public String getDescription(){
        return description;
    }

}
