/**
 * Copyright (C), 2019-2020, 宇信融汇
 * FileName: T
 * Author:   xbliu
 * Date:     2020/5/29 10:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * xbliu           修改时间           版本号              描述
 */
package com.msbvip.juc.c_002;


/**
 * @Classname T
 * @Description synchronized关键字
 * 对某个对象加锁
 * @Date 2020/5/29 10:59
 * @Created by xbliu
 */
public class T {
    private Integer count = 10;
    private Object o = new Object();

    public static void main(String[] args) {
        T t = new T();
        t.m();
    }

    private void m() {
        synchronized (o) {//任何要执行这段代码的都需要先拿下来O的锁
            count--;
            System.out.println(Thread.currentThread().getName()+"----count="+count);
        }
    }
}
