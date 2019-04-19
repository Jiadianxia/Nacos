package com.example.nacosspringbootdemo.test;

/**
 * <p>
 *     自定义注解的学习解释
 * <p>
 * </p>
 *
 * @author jiadianxia001
 * @since 2019/3/26
 */

public class NoBug {
    @Jiancha
    public void suanShu(){
        System.out.println("1234567890");
    }
    @Jiancha
    public void jiafa(){
        System.out.println("1+1="+1+1);
    }
    @Jiancha
    public void jiefa(){
        System.out.println("1-1="+(1-1));
    }
    @Jiancha
    public void chengfa(){
        System.out.println("3 x 5="+ 3*5);
    }
    @Jiancha
    public void chufa(){
        System.out.println("6 / 0="+ 6 / 0);
    }

    public void ziwojieshao(){
        System.out.println("我写的程序没有 bug!");
    }

}
