package com.tss.report.interfaces.task.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: MQG
 * @date: 2018/11/27
 */
public enum TaskStatusEnum {
    
    WAIT(1, "待发布"),
    PUBLISH(2, "已发布");

    private Integer status;
    private String desc;
    
    TaskStatusEnum(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }
    
    public static Map<Integer, TaskStatusEnum> taskStatusMap = 
            Arrays.stream(TaskStatusEnum.values()).collect(Collectors.toMap(TaskStatusEnum::getStatus, e -> e));

    public Integer getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }
    
    public TaskStatusEnum getByStatus(Integer status) {
        return taskStatusMap.get(status);
    }

}
