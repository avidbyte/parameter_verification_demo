package com.example.parameter.verification.demo.custom.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author aaron
 * @since 2021-08-14
 */
public class AnnotationTestTool {


    public static void process(String className) throws ClassNotFoundException {
        int myTagNum = 0;
        int noMyTagNum = 0;
        int zero = 0;
        int other = 0;

        // 遍历 clazz  对应的类里的所有方法
        Class<?> clazz = Class.forName(className);
        for (Method m : clazz.getMethods()) {

            String methodName = m.getName();
            System.out.println(methodName);

            //如果该方法使用了 @MyTag 修饰
            if (m.isAnnotationPresent(MyTag.class)) {
                myTagNum++;
                Annotation tag = m.getAnnotation(MyTag.class);
                String value = ((MyTag) tag).value();
                if ("0".equals(value)) {
                    zero++;
                } else {
                    other++;
                }
            } else {
                noMyTagNum++;
            }
        }

        // 统计测试结果
        System.out.println("共运行了：" + (myTagNum + noMyTagNum) + "个方法，其中：" +
                "\n" + "使用了@MyTag注解的方法有：" + myTagNum + "个， " +
                "\n" + "未使用了@MyTag注解的方法有：" + noMyTagNum + "个， " +
                "\n" + "MyTag注解使用默认值的有：" + zero + "个， " +
                "\n" + "MyTag注解未使用默认值的有：" + other + "个。 "
        );

    }

}
