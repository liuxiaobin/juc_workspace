/**
 * Copyright (C), 2019-2020, 宇信融汇
 * FileName: T3
 * Author:   xbliu
 * Date:     2020/6/3 14:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * xbliu           修改时间           版本号              描述
 */
package com.msbvip.juc.c_003;

/**
 * @Classname T3
 * @Description 线程同步
 * @Date 2020/6/3 14:10
 * @Created by xbliu
 */
public class T3 implements Runnable {
    T4 t4 = new T4();

    public static void main(String[] args) {
        T3 t3 = new T3();
        Thread t1 = new Thread(t3);
        Thread t2 = new Thread(t3);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        t4.add(Thread.currentThread().getName());
    }
}

class T4 {
    private static int num = 0;

    public void add(String name) {
        synchronized (this) {
        }
        num++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {

        }
        System.out.println(name + "你是第" + num + "个使用T4的线程");
    }
}
