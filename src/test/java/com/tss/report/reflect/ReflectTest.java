package com.tss.report.reflect;

import com.github.pagehelper.PageInfo;
import com.tss.report.interfaces.task.vo.StudentTaskRespVO;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.lang.reflect.Type;

/**
 * @author: MQG
 * @date: 2018/11/28
 */
public class ReflectTest {
    
    @Test
    public void testType() {
        PageInfo<StudentTaskRespVO> pageInfo = new PageInfo<>();
        Class<? extends PageInfo> aClass = pageInfo.getClass();
        Type genericSuperclass = aClass.getGenericSuperclass();
        ParameterizedTypeImpl typeImpl = (ParameterizedTypeImpl)genericSuperclass;
        Class<?> rawType = typeImpl.getRawType();
        Type[] actualTypeArguments = typeImpl.getActualTypeArguments();

        Class<? extends Type> aClass1 = genericSuperclass.getClass();
        System.out.println(aClass);

    }
}
