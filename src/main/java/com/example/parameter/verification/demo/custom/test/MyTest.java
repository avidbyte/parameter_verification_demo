package com.example.parameter.verification.demo.custom.test;

/**
 * @author aaron
 * @since 2021-08-14
 */
public class MyTest {

    @MyTag
    public static void t1() {}

    public static void t2() {}

    @MyTag(value = "t3")
    public static void t3() {}

    public static void t4() {}

    @MyTag
    public static void t5() {}

    public static void t6() {}

    @MyTag(value = "t7")
    public static void t7() {}

    public static void t8() {}

}
