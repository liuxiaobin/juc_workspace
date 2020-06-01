/**
 * Copyright (C), 2019-2020, 宇信融汇
 * FileName: T
 * Author:   xbliu
 * Date:     2020/6/1 15:35
 * Description: 同步方法和非同步方法是通可以同时调用
 * History:
 * <author>          <time>          <version>          <desc>
 * xbliu           修改时间           版本号              描述
 */
package com.msbvip.juc.c_003;

/**
 * @Classname T
 * @Description TODO
 * @Date 2020/6/1 15:35
 * @Created by xbliu
 */
public class T {
    public synchronized void m1() {
        System.out.println(Thread.currentThread().getName() + "M1 start");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "M1 END");
    }
    public  void m2() {
        System.out.println(Thread.currentThread().getName() + "M2 start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "M2 END");
    }

    public static void main(String[] args) {
        T t = new T();
       // new Thread(() ->t.m1(),"m1").start();
        //new Thread(() ->t.m2(),"m2").start();
        //1.8JDK之前写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m2();
            }
        }).start();

    }
}
