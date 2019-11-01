package com.hshc.ldg.heenoor.study.enums;


/**
 * @Description:  牌照性质
 * @Author: lidongge
 * @Date: 2018/10/8 15:45
 */
public enum PlateTypeEnum implements  ISEnum {

    FILLED      (1, "营运"),
    NOT_FILLED  (2, "非营运");

    private Integer code;
    private String  name;

    PlateTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    public static String findName(Integer code){
        for (PlateTypeEnum item:PlateTypeEnum.values()) {
            if (item.eq(code)){
                return item.getName();
            }
        }

        return null;
    }

}
