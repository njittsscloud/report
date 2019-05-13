package com.tss.report.interfaces.enums;

/**
 * 删除标志枚举
 * 
 * @author: MQG
 * @date: 2018/11/30
 */
public enum DelFlagEnum {

    UN_DELETED(0, "未删除"),
    DELETED(1, "已删除");

    private int value;
    private String desc;

    DelFlagEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int value() {
        return value;
    }

    public String desc() {
        return desc;
    }
}
