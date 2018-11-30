package com.tss.report.interfaces.report.enums;

/**
 * @author: MQG
 * @date: 2018/11/30
 */
public enum ReportCorrectEnum {

    WAIT(1, "带批阅"),
    UN_PUBLISH(2, "待发布"),
    PUBLISH(3, "已发布");

    private int value;
    private String desc;

    ReportCorrectEnum(int value, String desc) {
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
