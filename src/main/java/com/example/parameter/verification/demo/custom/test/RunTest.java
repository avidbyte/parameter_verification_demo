package com.example.parameter.verification.demo.custom.test;

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
