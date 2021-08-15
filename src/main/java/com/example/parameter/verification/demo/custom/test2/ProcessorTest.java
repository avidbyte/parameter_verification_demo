package com.example.parameter.verification.demo.custom.test2;

import java.lang.reflect.Method;

/**
 * @author aaron
 * @since 2021-08-15
 */
public class ProcessorTest {


    public static void process(String clazz) throws ClassNotFoundException{
        int passed = 0;
        int failed = 0;

        // 遍历 clazz  对应的类里的所有方法

        for(Method m  : Class.forName(clazz).getMethods()){

            //如果该方法使用了 @MyTag 修饰
            if(m.isAnnotationPresent(Testable.class)){
                try {
                    // 调用 m 方法
                    m.invoke(null);
                    passed++;
                }catch (Exception e){
                    System.out.println("方法"+m+"运行失败，异常："+e.getCause());
                    failed++;
                }
            }
        }
        // 统计测试结果
        System.out.println("共运行了："+(passed+failed) + "个方法，其中： \n" + "失败了："+failed+"个， \n"+"成功了："+passed+"个！");

    }

}
