package com.tss.report.interfaces.report.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: MQG
 * @date: 2018/11/30
 */
public enum ReportCorrectEnum {

    WAIT(1, "待批阅"),
    UN_PUBLISH(2, "待发布"),
    PUBLISH(3, "已发布");

    private int value;
    private String desc;
    
    private static Map<Integer, ReportCorrectEnum> valueMap = 
            Arrays.stream(ReportCorrectEnum.values()).collect(Collectors.toMap(ReportCorrectEnum::value, e -> e));

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
    
    public static ReportCorrectEnum getByValue(int value) {
        return valueMap.get(value);
    }

    public static String getDescByValue(int value) {
        ReportCorrectEnum reportCorrectEnum = valueMap.get(value);
        return reportCorrectEnum == null ? "" : reportCorrectEnum.desc();
    }
}
