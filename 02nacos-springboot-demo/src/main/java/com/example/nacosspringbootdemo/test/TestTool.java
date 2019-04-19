package com.example.nacosspringbootdemo.test;

import java.lang.reflect.Method;

/**
 * <p>
 * 测试自定义注解
 * <p>
 * </p>
 *
 * @author jiadianxia001
 * @since 2019/3/26
 */

public class TestTool {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        NoBug testobj = new NoBug();

        Class clazz = testobj.getClass();

        Method[] method = clazz.getDeclaredMethods();
        //用来记录测试产生的 log 信息
        StringBuilder log = new StringBuilder();
        // 记录异常的次数
        int errornum = 0;

        for (Method m : method) {
            // 只有被 @Jiancha 标注过的方法才进行测试
            //判断该方法是否应用了Jiancha注解
            if (m.isAnnotationPresent(Jiancha.class)) {
                try {
                    Jiancha jiancha = m.getAnnotation(Jiancha.class);
                    m.setAccessible(true);
                    //方法的反射
                    //method.invoke(owner, args)：执行该Method.invoke方法的参数是执行这个方法的对象owner，
                    // 和参数数组args，可以这么理解
                    // ：owner对象中带有参数args的method方法。返回值是Object，也既是该方法的返回值。
                    m.invoke(testobj, null);

                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    //e.printStackTrace();
                    errornum++;
                    log.append(m.getName());
                    log.append(" ");
                    log.append("has error:");
                    log.append("\n\r  caused by ");
                    //记录测试过程中，发生的异常的名称
                    log.append(e.getCause().getClass().getSimpleName());
                    log.append("\n\r");
                    //记录测试过程中，发生的异常的具体信息
                    log.append(e.getCause().getMessage());
                    log.append("\n\r");
                }
            }
        }


        log.append(clazz.getSimpleName());
        log.append(" has  ");
        log.append(errornum);
        log.append(" error.");

        // 生成测试报告
        System.out.println(log.toString());

    }

}