package com.example.parameter.verification.demo.custom.test3;

import com.example.parameter.verification.demo.custom.test.AnnotationTestTool;

/**
 * @author aaron
 * @since 2021-08-14
 */
public class RunTest {

    public static void main(String[] args) throws ClassNotFoundException {
        // 处理 MyTest 类
        AnnotationTestTool.process("com.example.parameter.verification.demo.component.test.MyTest");
    }

}
