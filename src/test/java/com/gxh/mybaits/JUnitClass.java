package com.gxh.mybaits;

import org.junit.*;
import org.junit.Test;
/**
 * java测试类  测试JUnit中的注解
 *
 * @BeforeClass 全局只会执行一次，而且是第一个运行
 * @Before      在测试方法运行之前运行
 * @Test        测试方法
 * @After       在测试方法运行之后允许
 * @AfterClass  全局只会执行一次，而且是最后一个运行
 * @Ignore      忽略此方法
 */
public class JUnitClass {
    private static Calculator calculator = new Calculator();

    @Before
    public void setUp() throws Exception {
        calculator.clear();
        System.out.println("这个方法开始");
    }

    @After
    public void delete(){
        System.out.println("这个方法结束");
    }
    @Test
    public void testAdd() {
        calculator.add(3);
        calculator.add(4);
        System.out.println(calculator.getResult());

    }

    @Test
    public void testSubstract() {
        calculator.add(8);
        calculator.substract(3);
        System.out.println(calculator.getResult());

    }

    @Ignore("Multiply() Not yet implemented")
    @Test
    public void testMultiply() {
        System.out.println("Not yet implemented");
    }

    @Test
    public void testDivide() {
        calculator.add(8);
        calculator.divide(2);
        System.out.println(calculator.getResult());

    }

}


