/**
 * Copyright (C), 2019-2020, 宇信融汇
 * FileName: T2
 * Author:   xbliu
 * Date:     2020/6/2 11:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * xbliu           修改时间           版本号              描述
 */
package com.msbvip.juc.c_003;

/**
 * @Classname T2
 * @Description TODO
 * @Date 2020/6/2 11:42
 * @Created by xbliu
 */
public class T2 {
    public static void main(String[] args) {
        MyThread1 m = new MyThread1("MyThread1");

        m.start();
        try {
           m.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <=10; i++) {
            System.out.println("我是主线程");
        }
    }
}

class MyThread1 extends Thread {
    MyThread1(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(getName() + "---------------" + getState());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
